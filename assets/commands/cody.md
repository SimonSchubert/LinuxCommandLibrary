# TLDR

**Log in via web browser**

```cody auth login --web```

**Send a chat message**

```cody chat -m "Explain React hooks"```

**Ask about a local file**

```cody chat --context-file [src/app.ts] -m "Are there code smells here?"```

**Use a remote repository** as context

```cody chat --context-repo [github.com/owner/repo] -m "[question]"```

**Generate commit message** from git diff

```git diff | cody chat --stdin -m "Write a commit message for this diff"```

**Check authentication status**

```cody auth whoami```

# SYNOPSIS

**cody** _command_ [_options_]

# COMMANDS

**auth login** [**--web**]
> Authenticate with Sourcegraph. Use --web for browser-based login.

**auth logout**
> Sign out and remove stored access token.

**auth whoami**
> Display current authentication status.

**chat** [**-m** _message_]
> Send a message to Cody AI assistant.

**help**
> Display help information.

# PARAMETERS

**-m**, **--message** _text_
> Message to send to Cody.

**--context-file** _path_
> Include local file as context for the query.

**--context-repo** _repository_
> Include remote repository as context (e.g., github.com/owner/repo).

**--stdin**
> Read input from standard input.

**--model** _model_
> Specify LLM model (e.g., claude-3.5-sonnet).

# DESCRIPTION

**cody** is the command-line interface for Sourcegraph's Cody AI coding assistant. It provides terminal access to the same AI technology that powers Cody's IDE extensions, enabling code understanding, generation, and analysis directly from the command line.

The CLI supports contextual queries using local files via **--context-file** or remote repositories via **--context-repo**, allowing Cody to provide more accurate and relevant responses based on your codebase.

Standard input integration enables powerful workflow automation. Pipe git diffs for commit messages, code output for analysis, or logs for debugging assistance. Multiple input methods can be combined in a single query.

Authentication credentials are stored securely in the operating system's credential manager. Alternatively, use **SRC_ENDPOINT** and **SRC_ACCESS_TOKEN** environment variables for CI/CD pipelines or ephemeral environments.

# CAVEATS

Requires Node.js v20 or newer. The CLI is marked as experimental and requires a Sourcegraph account. Starting **July 2025**, Cody Free and Pro plans were discontinued; users are directed to Amp (ampcode.com) as an alternative. Enterprise accounts continue to have access.

# HISTORY

Cody was developed by **Sourcegraph**, a company founded in **2013** focused on code intelligence and search tools. Cody was introduced in **2023** as an AI coding assistant leveraging Sourcegraph's code graph technology for enhanced context awareness. The CLI was released to complement IDE extensions, enabling terminal-based and scripted AI assistance workflows.

# SEE ALSO

[claude](/man/claude)(1), [gh](/man/gh)(1), [copilot](/man/copilot)(1)
