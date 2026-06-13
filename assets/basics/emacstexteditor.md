# Emacs Text Editor

## Getting Started
Emacs keybindings use a shorthand notation: **C-** means hold Ctrl, and **M-** means hold Alt (Meta). For example, **C-x C-s** means press Ctrl+x, then Ctrl+s. Start Emacs with **-nw** to run it inside the terminal instead of opening a window.
```[emacs](/man/emacs) textfile.txt```
```[emacs](/man/emacs) -nw textfile.txt```

| Key | Description |
|-----|-------------|
| **C-x C-f** | Open a file |
| **C-x C-s** | Save current file |
| **C-x C-w** | Save as (write to a different file) |
| **C-x C-c** | Quit Emacs |
| **C-g** | Cancel current command or operation |
| **C-/** | Undo last change (also **C-x u**) |

Stuck in a command you did not mean to start? **C-g** cancels almost anything. The built-in interactive tutorial is at **C-h t**.

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
| **C-v** | Scroll down one page |
| **M-v** | Scroll up one page |
| **M-<** | Move to beginning of buffer |
| **M->** | Move to end of buffer |
| **M-g g** | Jump to a line number |
| **C-M-a** | Move to beginning of function |
| **C-M-e** | Move to end of function |

## Editing
Mark a region with **C-SPC** to set the start point, then move the cursor to select text. Emacs says "kill" for cut and "yank" for paste.

| Key | Description |
|-----|-------------|
| **C-SPC** | Set mark (start of selection) |
| **C-x h** | Select the entire buffer |
| **C-w** | Cut (kill) selected region |
| **M-w** | Copy selected region |
| **C-y** | Paste (yank) last killed text |
| **M-y** | After **C-y**: cycle through earlier killed text |
| **C-k** | Kill from cursor to end of line |
| **C-d** | Delete character under cursor |
| **M-d** | Kill from cursor to end of word |
| **TAB** | Indent current line |
| **C-x C-+** | Increase text size |
| **C-x C--** | Decrease text size |

Killed text accumulates in the **kill ring**, not just a single clipboard. Press **C-y** then repeat **M-y** to step back through everything you killed recently.

## Search and Replace
Emacs uses incremental search: results appear as you type. Press **C-s** again to jump to the next match, **Enter** to stop at the current one, or **C-g** to cancel and return to where you started.

| Key | Description |
|-----|-------------|
| **C-s** | Search forward (incremental) |
| **C-r** | Search backward (incremental) |
| **M-%** | Search and replace (query mode) |

In query replace, answer **y** to replace, **n** to skip, **!** to replace all remaining, **q** to stop.

## Buffers and Windows
Every open file lives in a **buffer**. Emacs can split the screen into multiple windows, each showing a buffer.

| Key | Description |
|-----|-------------|
| **C-x 2** | Split into top and bottom windows |
| **C-x 3** | Split into left and right windows |
| **C-x 1** | Close all windows except current |
| **C-x 0** | Close current window |
| **C-x o** | Switch to the next window |
| **C-x b** | Switch to a different buffer by name |
| **C-x C-b** | List all open buffers |
| **C-x k** | Kill (close) a buffer |
| **C-x d** | Open the directory browser (Dired) |

## Commands
Run any command by name with **M-x** followed by the command name. Every keybinding is a shortcut for one of these commands.

| Key | Description |
|-----|-------------|
| **M-x eshell** | Open a terminal shell inside Emacs |
| **M-x toggle-word-wrap** | Toggle word wrapping |
| **M-x flyspell-mode** | Toggle spell checking |
| **M-x display-line-numbers-mode** | Toggle line numbers |
| **M-x visual-line-mode** | Toggle visual line wrapping |
| **M-x compile** | Run a compile command |
| **M-x package-list-packages** | Browse and install packages |

## Getting Help
Emacs documents itself. The help system answers "what does this key do" and "which key runs this command".

| Key | Description |
|-----|-------------|
| **C-h t** | Open the interactive tutorial |
| **C-h k** | Describe what a key combination does |
| **C-h f** | Describe a function |
| **C-h v** | Describe a variable |
| **C-h a** | Search commands by keyword |
