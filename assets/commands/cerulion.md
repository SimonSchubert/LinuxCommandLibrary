# TAGLINE

Run, record, and replay a ROS 2-compatible robotics graph

# TLDR

**Sign in** once on this machine

```cerulion login```

Create a workspace from the **obstacle-avoidance** starter

```cerulion workspace create safety_demo --starter obstacle_avoidance```

**Build** a node in release mode

```cerulion node build laser_scanner --release```

**Check** a graph, then run it and record

```cerulion graph validate obstacle_avoidance```

```cerulion graph run obstacle_avoidance --release --record```

**Echo** one topic while it runs

```cerulion topic echo /obstacle_avoidance/safety_controller/linear_velocity```

**Replay** a recording and compare outputs

```cerulion bag play [recordings/run.mcap] --resim all --verify```

# SYNOPSIS

**cerulion** _COMMAND_ [_OPTIONS_]

# DESCRIPTION

**cerulion** is the command-line client for Cerulion, a robotics runtime that runs a graph as one process per node, records it, and replays the recording to check that code still produces the same outputs. The Cargo package name is the binary name with an underscore before `cli`. The binary you type is `cerulion`.

The official installer links the binary into `~/.local/bin`. A Homebrew formula is `cerulion-inc/cerulion/cerulion`. Debian and Ubuntu packages come from `https://apt.cerulion.com` (package `cerulion`, signing-key fingerprint `953C69FD279D9256FA4B71C5DA5FDE5D0DC6D91B`). From source:

```cargo install --locked cerulion_cli cerulion_netd```

Linux packages target x86-64 and ARM64 with glibc 2.31 or newer, and they include a ROS 2 Jazzy rmw. macOS packages do not include that rmw. Building your own nodes needs a C toolchain and Rust 1.95 or newer. [cerulion-install-rust](/man/cerulion-install-rust)(1) installs that toolchain when it is missing. `workspace create` and `node build` offer the same install.

Commands used in the published quickstart:

- `login` — sign in. A headless machine prints a code to approve in a browser.
- `workspace create NAME --starter NAME` — new workspace. The quickstart starter is the name in the example above.
- `node build NAME --release` — compile a node. The first build also compiles the runtime.
- `graph validate NAME` — check a graph.
- `graph run NAME --release --record` — run and write a recording. `--network off` keeps the run on this machine. Ctrl-C stops it.
- `topic echo PATH` — print one topic.
- `bag play RECORDING --resim all --verify` — replay and compare. `--tolerance` allows per-field differences. `--report` writes a machine-readable report.
- `ros2 run` and `ros2 launch` — run ROS 2 nodes through the bundled rmw, on Linux packages that include it.

Replay exit codes from the project: 0 when compared frames match, 1 when output data diverges, 6 when the execution schedule diverges, and 2 through 5 when verification could not finish.

Two companion programs, `cerulion-connectd` (desk) and `cerulion-remoted` (robot), ship beside the CLI. They are not documented on their own pages.

# CAVEATS

`graph run` starts the processes described by the graph. A recording path from `bag play` is re-executed with those nodes. License is AGPL-3.0-only.

Vendor apt and the curl installer are not distro packages. Prefer the package indexes when they carry this project.

# SEE ALSO

[cerulion-install-rust](/man/cerulion-install-rust)(1), [cargo](/man/cargo)(1), [rustc](/man/rustc)(1)

# RESOURCES

```[Source code](https://github.com/cerulion-inc/cerulion)```

```[Homepage](https://cerulion.com)```

```[Documentation](https://docs.cerulion.com)```

<!-- verified: 2026-11-17 -->
