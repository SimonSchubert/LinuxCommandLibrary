# VIM Text Editor

## Modes
Unlike most editors, VIM does not let you type text right away. It starts in **Normal mode**, where key presses are commands instead of text input. You switch between modes depending on what you want to do.
```[vim](/man/vim) textfile.txt```

| Key | Description |
|-----|-------------|
| **i** | Enter Insert mode — type text freely |
| **v** | Enter Visual mode — select characters |
| **V** | Enter Visual Line mode — select whole lines |
| **Ctrl+v** | Enter Visual Block mode — select a rectangle |
| **:** | Enter Command-line mode — run commands |
| **R** | Enter Replace mode — overwrite existing text |
| **Esc** | Return to Normal mode |

## File Management
All commands starting with **:** are typed in Command-line mode. Press **Enter** to execute them.

| Key | Description |
|-----|-------------|
| **:e** | Reload current file from disk |
| **:e {file}** | Open a file for editing |
| **:w** | Save current file |
| **:w {file}** | Save to a different file |
| **:q** | Quit (fails if there are unsaved changes) |
| **:q!** | Quit and discard unsaved changes |
| **:wq** | Save and quit |
| **:x** | Save and quit (only writes if modified) |

## Navigation
These work in Normal mode. VIM uses **h j k l** instead of arrow keys, but arrow keys also work.

| Key | Description |
|-----|-------------|
| **h** | Move left |
| **j** | Move down |
| **k** | Move up |
| **l** | Move right |
| **w** | Jump to start of next word |
| **W** | Jump to start of next WORD (whitespace-separated) |
| **e** | Jump to end of word |
| **E** | Jump to end of WORD |
| **b** | Jump back to start of previous word |
| **B** | Jump back to start of previous WORD |
| **0** | Jump to start of line |
| **$** | Jump to end of line |
| **gg** | Jump to first line of file |
| **G** | Jump to last line of file |
| **{number}G** | Jump to a specific line number |
| **gk** | Move up one display line (useful for wrapped lines) |
| **gj** | Move down one display line (useful for wrapped lines) |

## Insertion
Each of these enters Insert mode from Normal mode, but places the cursor differently. Press **Esc** when done to return to Normal mode.

| Key | Description |
|-----|-------------|
| **i** | Insert before cursor |
| **I** | Insert at beginning of line |
| **a** | Append after cursor |
| **A** | Append at end of line |
| **o** | Open a new line below and start inserting |
| **O** | Open a new line above and start inserting |
| **R** | Replace mode — type over existing characters |
| **:r {file}** | Insert contents of a file below the cursor |

## Editing
These work in Normal mode. VIM combines operators like **d** (delete) and **y** (yank/copy) with motions like **w** (word) or **$** (end of line).

| Key | Description |
|-----|-------------|
| **u** | Undo last change |
| **Ctrl+r** | Redo last undone change |
| **yy** | Yank (copy) the current line |
| **y{motion}** | Yank text covered by a motion (e.g. **yw** for a word) |
| **p** | Paste after cursor |
| **P** | Paste before cursor |
| **x** | Delete character under cursor |
| **dd** | Delete current line |
| **d{motion}** | Delete text covered by a motion (e.g. **dw** for a word) |
| **.** | Repeat the last change |

## Search and Replace
Press **/** or **?** in Normal mode to start a search. Replace commands use the **:** command line.

| Key | Description |
|-----|-------------|
| **/pattern** | Search forward for pattern |
| **?pattern** | Search backward for pattern |
| **n** | Jump to next match |
| **N** | Jump to previous match |
| **:s/foo/bar/** | Replace first occurrence of foo with bar on current line |
| **:s/foo/bar/g** | Replace all occurrences of foo with bar on current line |
| **:%s/foo/bar/g** | Replace all occurrences of foo with bar in the entire file |
| **:%s/foo/bar/gc** | Replace all in file, asking for confirmation each time |

## Multiple Windows
VIM can split the screen to show multiple files at once. Window commands start with **Ctrl+w**.

| Key | Description |
|-----|-------------|
| **:split {file}** | Split horizontally and open file |
| **:vsplit {file}** | Split vertically and open file |
| **:sview {file}** | Split horizontally and open file as read-only |
| **Ctrl+w w** | Cycle to the next window |
| **Ctrl+w k** | Move to the window above |
| **Ctrl+w j** | Move to the window below |
| **Ctrl+w h** | Move to the window on the left |
| **Ctrl+w l** | Move to the window on the right |
| **Ctrl+w _** | Maximize current window height |
| **Ctrl+w =** | Make all windows equal size |
| **:hide** | Close the current window |
| **:only** | Close all windows except the current one |
| **:ls** | List all open buffers |
| **:b {number}** | Switch to a buffer by its number |
