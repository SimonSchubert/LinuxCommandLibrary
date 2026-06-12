# Nano Text Editor

## Getting Started
Nano is designed to be simple and beginner-friendly. It shows the most important shortcuts at the bottom of the screen: **^** means Ctrl and **M-** means Alt, so **^X** is Ctrl+X and **M-U** is Alt+U.
```[nano](/man/nano) textfile.txt```
```[nano](/man/nano) +25 textfile.txt```

| Key | Description |
|-----|-------------|
| **Ctrl+G** | Display help text |
| **Ctrl+X** | Exit nano (prompts to save if modified) |

> To save and quit: **Ctrl+X**, answer **y**, confirm the file name with **Enter**.

Useful startup options:

| Option | Description |
|-----|-------------|
| **+25** | Open the file at line 25 |
| **-l** | Show line numbers |
| **-v** | View mode (read-only) |
| **-B** | Keep a backup of the previous version when saving |

## Navigation
Use the arrow keys for basic movement, or these shortcuts for faster navigation.

| Key | Description |
|-----|-------------|
| **Ctrl+A** | Move to beginning of line |
| **Ctrl+E** | Move to end of line |
| **Ctrl+Y** | Scroll up one page |
| **Ctrl+V** | Scroll down one page |
| **Ctrl+Left** | Move to previous word |
| **Ctrl+Right** | Move to next word |
| **Ctrl+_** | Go to a specific line (and column) number |
| **Ctrl+C** | Show current cursor position (line, column) |

## File Operations
Nano prompts for the file name before writing, so you can also save under a new name.

| Key | Description |
|-----|-------------|
| **Ctrl+O** | Write out (save) the current file |
| **Ctrl+R** | Read (insert) another file into the current one |
| **Alt+<** | Switch to the previous open file |
| **Alt+>** | Switch to the next open file |

## Search and Replace
Search remembers the last term: press **Enter** at an empty search prompt to reuse it.

| Key | Description |
|-----|-------------|
| **Ctrl+W** | Search forward |
| **Ctrl+Q** | Search backward |
| **Alt+W** | Repeat search, next match |
| **Alt+Q** | Repeat search, previous match |
| **Ctrl+\\** | Search and replace |

> During replace, answer **y** to replace one match, **n** to skip, **a** to replace all.

## Editing
Cut and paste work on whole lines by default. To work on a selection, set a mark first with **Alt+A**, then move the cursor to select.

| Key | Description |
|-----|-------------|
| **Ctrl+K** | Cut the current line (or selected text) |
| **Alt+6** | Copy the current line (or selected text) |
| **Ctrl+U** | Paste the last cut text |
| **Alt+A** | Start selecting text (set mark) |
| **Alt+U** | Undo |
| **Alt+E** | Redo |
| **Ctrl+D** | Delete the character under the cursor |
| **Ctrl+J** | Justify the current paragraph |
| **Ctrl+T** | Execute a command (or spell check in older versions) |
| **Alt+#** | Toggle line numbers |

> Holding **Shift** with the arrow keys also selects text in modern nano versions.

## Configuration
Nano reads **~/.nanorc** at startup. Options set there apply to every session.
```set linenumbers```
```set tabsize 4```
```set tabstospaces```
```set autoindent```
```set mouse```
