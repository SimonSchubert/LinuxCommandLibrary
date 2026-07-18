# TAGLINE

Interactive coding agent for DwarfStar local LLM inference

# TLDR

**Start the agent** with a model and large context

```ds4-agent -m [ds4flash.gguf] --ctx [100000]```

**Run a single non-interactive turn**

```ds4-agent -m [ds4flash.gguf] --non-interactive -p "[fix the failing test]"```

**Lower GPU power** for quieter runs

```ds4-agent -m [ds4flash.gguf] --power [50]```

**Write a debug trace** of prompts and tool calls

```ds4-agent -m [ds4flash.gguf] --trace [agent.trace]```

**Change working directory** before loading assets

```ds4-agent -m [ds4flash.gguf] --chdir [/path/to/project]```

**Disable thinking** for direct answers

```ds4-agent -m [ds4flash.gguf] --nothink```

# SYNOPSIS

**ds4-agent** [_options_]

# PARAMETERS

**-m**, **--model** _FILE_
> Path to the GGUF model. Default: **ds4flash.gguf**.

**-c**, **--ctx** _N_
> Allocated context length in tokens.

**-p**, **--prompt** _TEXT_
> Submit an initial prompt after startup (or a single turn with **--non-interactive**).

**--non-interactive**
> Run without the TUI. With **-p**: one turn then exit; without **-p**: read repeated prompts from stdin.

**-sys**, **--system** _TEXT_
> Extra system prompt text. Empty string disables the extra text.

**--trace** _FILE_
> Write prompt, token, and DSML tool-call debug output.

**--chdir** _DIR_
> Change working directory before loading runtime assets (useful so relative project paths resolve correctly).

**--power** _N_
> GPU duty-cycle target from 1 to 100. Default: **100**.

**--metal** | **--cuda** | **--rocm** | **--cpu**
> Select the inference backend explicitly.

**--ssd-streaming**
> Stream model weights from SSD when full residency does not fit.

**--think** / **--think-max** / **--nothink**
> Control model thinking/reasoning mode.

# DESCRIPTION

**ds4-agent** is the integrated coding agent that ships with **DwarfStar** (**ds4**). It loads the same specialized GGUF models as the interactive **ds4** CLI and **ds4-server**, then runs a tool-using agent loop aimed at local development work (reading files, editing, running commands via the model's DSML tool protocol).

In the interactive TUI you can manage long-lived sessions with slash commands: **/save** and **/list** / **/switch** for session persistence under **~/.ds4/kvcache**, **/compact** to shrink context, **/history**, **/new**, and **/power**. The agent is designed to work with the project's end-to-end local stack rather than as a generic agent framework.

# CAVEATS

Marked **alpha** quality by upstream relative to the rest of DwarfStar. Requires a DwarfStar-compatible GGUF and a suitable GPU backend for practical speed. Tool use and long sessions can consume large amounts of context and disk for KV checkpoints. The sibling interactive inference binary is also named **ds4**, which collides with unrelated DualShock 4 utilities of the same name.

# HISTORY

**ds4-agent** was added to the **DwarfStar** project after the core inference CLI and HTTP server, as part of the goal of shipping model + engine + agent together for local coding workflows on high-memory machines and SSD-streamed setups.

# SEE ALSO

[ds4-server](/man/ds4-server)(1), [ds4-bench](/man/ds4-bench)(1), [ds4-eval](/man/ds4-eval)(1), [ollama](/man/ollama)(1), [llama-cli](/man/llama-cli)(1)

# RESOURCES

```[Source code](https://github.com/antirez/ds4)```

```[Documentation](https://github.com/antirez/ds4/blob/main/docs/ENGINE_REFERENCE.md)```

<!-- verified: 2026-07-18 -->
