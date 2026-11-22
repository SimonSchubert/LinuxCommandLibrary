# TAGLINE

Port the slowest functions of an app to Rust and prove they still match

# TLDR

**Scan, port, verify, enable, and benchmark** in one step

```fast-anything go --agent claude -- python app.py```

Only **rank** hot functions

```fast-anything scan -- python app.py```

**Record** calls and set up a Rust crate for the top candidate

```fast-anything port```

**Replay** recorded calls against the port

```fast-anything verify```

**Switch** the app over to a verified port

```fast-anything enable```

**Time** the original against the Rust port

```fast-anything bench```

**Check** that Rust, the language runtime, and an agent are available

```fast-anything doctor```

# SYNOPSIS

**fast-anything** [**-C** _dir_] _command_ [_options_]

# PARAMETERS

**-C**, **--dir** _path_

> Project directory. Default is the current directory. This flag is accepted before any subcommand.

**go** **--** _command..._

> Run the whole loop: scan, port the hottest functions, verify them, enable the ones that match and are not slower, then benchmark. The program you profile follows **--**.

**--agent** _name_

> On **go** and **port**, the coding agent that writes the Rust. **claude**, **codex**, or any command that reads a prompt on stdin. Without it, **port** writes a **TASK.md** for you to hand to an agent yourself.

**--top** _n_

> On **go**, how many hot functions to port. Default **1**.

**--attempts** _n_

> On **go** and **port**, how many times the agent may try one function. Default **3**.

**--samples** _n_

> On **go** and **port**, how many real calls to record per function. Default **500**.

**--runs** _n_

> On **go** and **bench**, how many timing runs. Default **5**.

**scan** **--** _command..._

> Profile the command after **--** and rank functions by time and how portable they look.

**port** [_id_]

> Record calls for one function and create its Rust crate. With no _id_, the top candidate from the last scan is used.

**verify** [_id_]

> Release-build that port and replay every recorded call. The port must return the same values (floats within a small tolerance) and the same errors. Extra edge cases are derived from the recordings.

**verify** **--all**

> Verify every port. Cannot be combined with a function id.

**enable** [_id_]

> Splice the verified Rust into the app. Refuses a port that has not passed **verify** unless **--force** is set. A port that matches but is slower per call than the original is not enabled by **go**.

**enable** **--force**

> Enable even when verification has not passed.

**disable** [_id_]

> Remove one port and restore the original code.

**disable** **--all**

> Disable every enabled port. Cannot be combined with a function id.

**build**

> Rebuild every port. Used after a clone or a Rust toolchain upgrade.

**bench**

> Time the whole app with the original functions and with the Rust ports, interleaved.

**report**

> Write a Markdown report and an SVG card for the last benchmark.

**status**

> Show the last scan and every port.

**doctor**

> Check the Rust toolchain, the language runtimes, and the configured agents.

**mcp**

> Serve the same actions as an MCP server on stdin and stdout.

# DESCRIPTION

**fast-anything** profiles a program, asks a coding agent to rewrite only the hottest portable functions in Rust, replays recorded calls to prove the rewrite matches, and can swap that rewrite in. The original source stays in place; enabling a port inserts a marked block that **disable** removes. One shared Cargo target directory under **.fast** holds the ports.

The profiled command is everything after **--**, for example **python app.py**, **node app.ts**, **ruby app.rb**, **go run .**, or **php app.php**. Supported languages in the current tree include Python, JavaScript and TypeScript (Node, Bun, Deno), Ruby, Java, Kotlin, Go, PHP, C, C++, and C#. The functions it will move are top-level deterministic functions that take plain data. **scan** explains why a function was skipped.

Install the binary with **npm i -g @el4cteo/fast-anything** or **cargo install fast-anything**. Ports are compiled with the local Rust toolchain. The crate version in the repository is **0.7.0**. The license is MIT.

Setting this environment variable runs the original functions even when a port is enabled:

```FAST_ANYTHING_DISABLE=1```

# CAVEATS

**go** and **scan** do nothing useful without a command after **--**. The flag list before **--** belongs to **fast-anything**; the tokens after it are your program and its arguments.

A port is not enabled until every replayed call matches, including derived edge cases. A correct port that is slower per call than the original is also left disabled by **go**.

**--agent** shells out to whatever command you name. **doctor** is the check that the agent and the Rust toolchain are actually on **PATH**.

The hidden **__replay** subcommand is an internal helper for **verify**. It is not part of the user interface.

# SEE ALSO

[cargo](/man/cargo)(1), [rustc](/man/rustc)(1), [hyperfine](/man/hyperfine)(1), [py-spy](/man/py-spy)(1)

# RESOURCES

```[Source code](https://github.com/EL4CTEO/fast-anything)```

```[Homepage](https://www.npmjs.com/package/@el4cteo/fast-anything)```

<!-- verified: 2026-11-22 -->
