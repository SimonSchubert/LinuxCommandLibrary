# TAGLINE

Terminal AI coding agent with plan and agent modes, built for Termux, Linux, macOS, and Windows

# TLDR

**Start** an interactive session in the current project

```devx```

Start directly in **PLAN** (architect) mode

```devx --plan```

Install the npm package that provides the **devx** binary

```npm install -g termux-dev```

# SYNOPSIS

**devx** [**--plan**]

# PARAMETERS

**--plan**
> Start in PLAN mode (architect / requirements). The default is AGENT mode (autonomous edits and shell commands).

The npm package also installs a **termux-dev** alias that runs the same binary.

# DESCRIPTION

**devx** (npm package **termux-dev**) is an interactive terminal coding agent. It chats with a configured model provider, can read and edit project files, run shell commands, and roll back the last AI turn. It is aimed at **Android Termux** as well as desktop Linux, macOS, and Windows.

Two modes share one session. **PLAN** asks clarifying questions and produces an architecture plan without applying code dumps. **AGENT** implements changes, runs commands, and can auto-install packages. **Tab** toggles mode without losing draft text; approving a finished plan can switch into AGENT automatically.

On first launch, an onboarding wizard writes provider, model, and API key settings to **~/.devxrc.json**. Providers include OpenRouter, Google Gemini, DeepSeek, Groq, Mistral, OpenAI, Anthropic, Alibaba, and local OpenAI-compatible servers (Ollama, LM Studio). Requires **Node.js 20** or newer.

# SLASH COMMANDS

Typed at the prompt (prefix **/**). Unknown commands open a searchable palette.

**/plan** / **/agent**
> Switch mode.

**/image**
> Paste an image from the clipboard into the prompt (**Ctrl+P** / **Ctrl+V** also work).

**/serve** [_port_]
> Start a local HTTP preview server (default port **3000**). **/serve stop** halts it. On Android it can open via **termux-open-url**.

**/memory** [**add** _fact_ | **clear**]
> Show, append, or wipe the project memory bank (**.devx/memory.md**).

**/undo**
> Revert file changes from the last AI turn.

**/diff** / **/status** / **/commit**
> Show **git diff**, **git status**, or create a commit (AI-written message unless you pass one).

**/session** / **/resume** / **/session del**
> Show the active session, pick a saved session to resume (last 20 messages rendered), or delete sessions. Saved under **~/.devx/sessions/**.

**/settings**
> Toggle YOLO auto-approve, project memory, pure-black theme, startup update checks, and max agent iterations.

**/model** / **/provider**
> Switch model or provider for this session.

**/compact**
> Summarize the conversation to free context tokens.

**/init**
> Write an **AGENTS.md** starter in the project root.

**/update** / **/help** / **/clear** / **/exit**
> Self-update from GitHub, show help, redraw the banner, or quit.

# CONFIGURATION

**~/.devxrc.json**
> Provider, model, API keys, base URLs, auto-approve, theme, memory, and update-check flags. Created by the first-run wizard.

**.devx/memory.md**
> Project-local facts and rules loaded into context when project memory is enabled.

**~/.devx/sessions/**
> Saved chat sessions as JSON.

# CAVEATS

Needs a working Node.js 20+ install and (except for some local providers) a cloud API key. **Auto-approve (YOLO)** runs shell commands and file writes without confirmation. **/undo** only reverts files snapshotted in the last agent turn, not arbitrary git history. The CLI is a TUI and expects a real terminal.

# HISTORY

**devx** is developed by **ApvCode** as the **termux-dev** npm package (MIT license). The CLI reports version **1.1.2** in current releases.

# SEE ALSO

[aider](/man/aider)(1), [claude](/man/claude)(1), [opencode](/man/opencode)(1), [gemini](/man/gemini)(1)

# RESOURCES

```[Source code](https://github.com/apvcode/Termux-Dev)```

```[Homepage](https://www.npmjs.com/package/termux-dev)```

```[Documentation](https://github.com/apvcode/Termux-Dev#readme)```

<!-- verified: 2026-08-27 -->
