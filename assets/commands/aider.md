# TAGLINE

AI pair programming in the terminal

# TLDR

**Start** aider with files

```aider [file1.py] [file2.py]```

Use **specific model**

```aider --model [gpt-4] [file.py]```

Start in **architect mode**

```aider --architect [file.py]```

Enable **auto commits**

```aider --auto-commits [file.py]```

Use **local Ollama** model

```aider --model ollama/[llama2] [file.py]```

# SYNOPSIS

**aider** [_options_] [_files_...]

# DESCRIPTION

**aider** is an AI pair programming assistant that works in your terminal. It lets you have conversations with AI models (GPT-4, Claude, Ollama models, etc.) about your code, and the AI can directly edit your source files.

The tool integrates with git, can automatically commit changes, and understands your entire codebase context. You can add files to the conversation, ask questions, request changes, and watch the AI implement them.

# PARAMETERS

**--model** _name_
> AI model to use (gpt-4, gpt-3.5-turbo, claude-3-opus, etc.)

**--architect**
> Use architect mode for high-level planning

**--edit-format** _format_
> Edit format: diff, whole, diff-fenced

**--auto-commits**
> Automatically commit AI changes

**--no-auto-commits**
> Disable automatic commits

**--dark-mode**
> Use colors for dark terminal background

**--light-mode**
> Use colors for light terminal background

**--map-tokens** _n_
> Max tokens for repository map

**--no-git**
> Disable git integration

**--yes**
> Automatically confirm all prompts

**--message** _text_
> Send a message and exit

# CONFIGURATION

**.aider.conf.yml**
> Per-project configuration file for default options, model selection, and behavior settings.

**.aiderignore**
> Files and directories to exclude from the repository map, using .gitignore syntax.

# CAVEATS

Requires API keys for cloud models (OPENAI_API_KEY, ANTHROPIC_API_KEY, etc.). Token usage can be significant for large codebases. Review AI-generated changes before accepting them.

# HISTORY

**aider** was created by Paul Gauthier and released in **2023**. It was designed to leverage large language models for practical code editing, evolving rapidly with new AI model releases.

# SEE ALSO

[git](/man/git)(1), [gh](/man/gh)(1), [copilot](/man/copilot)(1)
