# TAGLINE

Prepare files and directories for LLM consumption

# TLDR

**Open** the interactive fzf picker and copy the selection to the clipboard

```llmcat```

**Copy** a single file with formatted headers

```llmcat [path/to/file.txt]```

**Walk** a directory and copy every non-ignored file

```llmcat [./src]```

**Print** only the directory tree, no file contents

```llmcat --tree-only [./src]```

**Add** custom ignore patterns on top of **.gitignore**

```llmcat -i [*.log] -i [*.tmp] [./src]```

**Include** hidden files and skip **.gitignore** rules

```llmcat --hidden --no-ignore [./src]```

**Show** what was copied to the clipboard

```llmcat -p [./src]```

# SYNOPSIS

**llmcat** [_options_] [_path_]

# PARAMETERS

**-i**, **--ignore** _PATTERN_
> Add a glob pattern to the ignore list (repeatable; uses the **fd** glob format).

**-t**, **--tree-only**
> Output only the directory tree, not file contents.

**-p**, **--print**
> Print the copied output to stdout in addition to the clipboard.

**-n**, **--no-ignore**
> Ignore **.gitignore** files when walking the tree.

**-H**, **--hidden**
> Include hidden files and directories.

**-q**, **--quiet**
> Silent mode — copy to clipboard without printing anything.

**-h**, **--help**
> Show usage information.

**-v**, **--version**
> Print the version and exit.

# INTERACTIVE KEYBINDINGS

```
Tab        Mark / unmark file
Shift-Tab  Unmark file
Ctrl-/     Toggle preview pane
Ctrl-D     Switch to directory mode
Ctrl-F     Switch to file mode
Enter      Confirm selection
Esc        Exit without copying
```

# DESCRIPTION

**llmcat** packages source files into a single LLM-friendly text blob and copies it to the system clipboard. Each file is wrapped with a header containing its path, so that a chat assistant such as **ChatGPT** or **Claude** can identify which file each snippet came from. Directories are walked respecting **.gitignore** by default, with additional ignore patterns added through **-i**.

When invoked without a path, llmcat opens an **fzf**-powered fuzzy picker with a live preview pane, supporting multi-file selection via **Tab**. With a path argument, it bypasses the picker and processes the target non-interactively, which is useful inside shell scripts and editor integrations.

# CAVEATS

llmcat depends on **fzf** for the interactive picker and on a system clipboard utility (**pbcopy** on macOS, **xclip** or **wl-copy** on Linux). Output for very large directories can exceed an LLM's context window — combine **--tree-only** with selective **-i** patterns or pipe through a token-counting tool first. There are several unrelated GitHub projects also called *llmcat*; this page documents the **azer/llmcat** implementation.

# HISTORY

**llmcat** was created by **Azer Koçulu** (**azer**) and published at **github.com/azer/llmcat**. It is one of several "cat for LLMs" utilities to emerge in 2024–2025 around the workflow of pasting code into chat-based assistants.

# SEE ALSO

[fzf](/man/fzf)(1), [bat](/man/bat)(1), [fd](/man/fd)(1), [pbcopy](/man/pbcopy)(1), [xclip](/man/xclip)(1)
