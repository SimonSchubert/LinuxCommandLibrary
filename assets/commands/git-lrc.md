# TAGLINE

AI-powered code review that runs on each git commit

# TLDR

**Set up and authenticate** the tool for the first time

```lrc setup```

**Run an AI review** on the currently staged changes

```git add . && lrc review```

**Commit changes** and trigger the automatic review

```git commit -m "[message]"```

**Skip the AI review** and take personal responsibility for the change

```lrc review --vouch```

**Bypass the review** entirely

```lrc review --skip```

**Manage AI connectors** or re-authenticate

```lrc ui```

**Enable or disable** the git hook integration

```lrc hooks enable```

# SYNOPSIS

**lrc** _command_ [_options_]

**git lrc** _command_ [_options_]

# DESCRIPTION

**git-lrc** (LiveReview Code) is an AI-powered code review tool that installs as a git pre-commit hook. After changes are staged, running **git commit** triggers an automatic AI review of the diff before the commit lands, catching bugs, security issues, and technical debt early. It can also be invoked manually as **lrc** or as the git subcommand **git lrc**.

Each commit records the review outcome, for example **ran (iter:3, coverage:85%)** or **vouched**, so review history travels with the repository. The tool delegates the actual review to a configurable AI provider, defaulting to Gemini's free tier and also supporting OpenAI, Claude, DeepSeek, and OpenRouter endpoints.

git-lrc is written in Go by HexmosTech and is distributed under a source-available license.

# PARAMETERS

**setup**

> Run the initial onboarding and authentication flow.

**review**

> Run an AI review on the currently staged changes.

**review --vouch**

> Skip the AI review and take personal responsibility for the change. The commit is logged as vouched.

**review --skip**

> Bypass the review entirely for this commit.

**ui**

> Open the connector management interface to configure AI providers or re-authenticate.

**hooks enable** | **disable** | **status**

> Enable, disable, or report the status of the git pre-commit integration.

# CAVEATS

The staged diff is sent to the configured cloud AI provider, so it is unsuitable for code that may not leave your machine. Installation goes through the vendor's **ipm** package manager rather than a system package repository. A free tier covers 30k lines of code per month, beyond which a paid plan is required.

# SEE ALSO

[git-commit](/man/git-commit)(1), [claude](/man/claude)(1), [copilot](/man/copilot)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/HexmosTech/git-lrc)```

```[Homepage](https://hexmos.com)```

<!-- verified: 2026-06-17 -->
