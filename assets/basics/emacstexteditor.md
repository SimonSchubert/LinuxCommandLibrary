# Emacs Text Editor

## Getting Started
Emacs keybindings use a shorthand notation: **C-** means hold Ctrl, and **M-** means hold Alt (Meta). For example, **C-x C-s** means press Ctrl+x, then Ctrl+s.
```[emacs](/man/emacs) textfile.txt```

| Key | Description |
|-----|-------------|
| **C-x C-f** | Open a file |
| **C-x C-s** | Save current file |
| **C-x C-w** | Save as (write to a different file) |
| **C-x C-c** | Quit Emacs |
| **C-g** | Cancel current command or operation |
| **C-x u** | Undo last change |

## Navigation
Movement commands come in pairs: **C-** moves by small units, **M-** moves by larger units.

| Key | Description |
|-----|-------------|
| **C-f** | Move forward one character |
| **C-b** | Move backward one character |
| **M-f** | Move forward one word |
| **M-b** | Move backward one word |
| **C-n** | Move to next line |
| **C-p** | Move to previous line |
| **C-a** | Move to beginning of line |
| **C-e** | Move to end of line |
| **M-a** | Move to beginning of sentence |
| **M-e** | Move to end of sentence |
| **M-{** | Move to beginning of paragraph |
| **M-}** | Move to end of paragraph |
| **C-M-a** | Move to beginning of function |
| **C-M-e** | Move to end of function |

## Editing
Mark a region with **C-SPACE** to set the start point, then move the cursor to select text.

| Key | Description |
|-----|-------------|
| **C-SPACE** | Set mark (start of selection) |
| **C-x h** | Select the entire buffer |
| **C-w** | Cut (kill) selected region |
| **M-w** | Copy selected region |
| **C-y** | Paste (yank) last killed text |
| **C-k** | Kill from cursor to end of line |
| **TAB** | Indent current line |
| **C-x C-+** | Increase text size |
| **C-x C--** | Decrease text size |

## Search and Replace
Emacs uses incremental search — results appear as you type.

| Key | Description |
|-----|-------------|
| **C-s** | Search forward (incremental) |
| **C-r** | Search backward (incremental) |
| **M-%** | Search and replace (query mode) |

## Buffers and Windows
Emacs can split the screen into multiple windows, each showing a buffer.

| Key | Description |
|-----|-------------|
| **C-x 2** | Split window horizontally |
| **C-x 3** | Split window vertically |
| **C-x 1** | Close all windows except current |
| **C-x 0** | Close current window |
| **C-x o** | Switch to the next window |
| **C-x b** | Switch to a different buffer by name |
| **C-x k** | Kill (close) a buffer |
| **C-x d** | Open the directory browser (Dired) |

## Commands
Run extended commands by name with **M-x** followed by the command name.

| Key | Description |
|-----|-------------|
| **M-x eshell** | Open a terminal shell inside Emacs |
| **M-x goto-line** | Jump to a specific line number |
| **M-x toggle-word-wrap** | Toggle word wrapping |
| **M-x flyspell-mode** | Toggle spell checking |
| **M-x linum-mode** | Toggle line numbers |
| **M-x visual-line-mode** | Toggle visual line wrapping |
| **M-x compile** | Run a compile command |
| **M-x package-list-packages** | Browse and install packages |
