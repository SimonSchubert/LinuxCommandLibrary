# TAGLINE

Interactively select and copy terminal output

# TLDR

**Select and copy**

```echo "[text]" | yank```

**Custom delimiter**

```echo "[text]" | yank -d "[\n]"```

**Copy to X clipboard**

```echo "[text]" | yank -x```

**With selection command**

```echo "[text]" | yank -- xclip```

# SYNOPSIS

**yank** [_-d delim_] [_-x_] [_options_] [_-- command_]

# PARAMETERS

**-d** _DELIM_
> Field delimiter.

**-x**
> X clipboard.

**-l**
> Line delimiter.

**--** _CMD_
> Yank command.

# DESCRIPTION

**yank** reads input from a pipe or file and presents it in a terminal selection interface. The user navigates lines or fields with arrow keys, selects the desired text, and yank copies it to the clipboard or passes it to a specified command.

By default, input is split into lines. The **-d** option sets a custom delimiter for splitting input into selectable fields, useful for extracting specific columns from structured output. The **-l** option forces line-by-line splitting regardless of content.

Clipboard integration works through an external command such as **xclip** or **xsel**, specified after **--**. On systems with X11, the **-x** flag provides a shortcut for X clipboard access. The tool is designed to fit naturally into Unix pipelines, accepting input from any command that writes to stdout.

# CAVEATS

Terminal required. Clipboard setup varies. Simple tool.

# HISTORY

**yank** was created for interactively selecting and copying terminal output to the clipboard.

# SEE ALSO

[xclip](/man/xclip)(1), [xsel](/man/xsel)(1), [fzf](/man/fzf)(1)
