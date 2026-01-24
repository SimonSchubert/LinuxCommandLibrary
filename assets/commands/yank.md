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

**yank** copies terminal output. It selects interactively.

Interactive selection. Pick text to copy.

Clipboard integration. Copy selected.

Custom delimiters. Split on anything.

Pipe-friendly. Works with other tools.

# CAVEATS

Terminal required. Clipboard setup varies. Simple tool.

# HISTORY

**yank** was created for interactively selecting and copying terminal output to the clipboard.

# SEE ALSO

[xclip](/man/xclip)(1), [xsel](/man/xsel)(1), [fzf](/man/fzf)(1)
