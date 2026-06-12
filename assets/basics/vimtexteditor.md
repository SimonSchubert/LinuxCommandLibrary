# VIM Text Editor

## Modes
Unlike most editors, VIM does not let you type text right away. It starts in **Normal mode**, where key presses are commands instead of text input. You switch between modes depending on what you want to do.
```[vim](/man/vim) textfile.txt```

| Key | Description |
|-----|-------------|
| **i** | Enter Insert mode: type text freely |
| **v** | Enter Visual mode: select characters |
| **V** | Enter Visual Line mode: select whole lines |
| **Ctrl+v** | Enter Visual Block mode: select a rectangle |
| **:** | Enter Command-line mode: run commands |
| **R** | Enter Replace mode: overwrite existing text |
| **Esc** | Return to Normal mode |

> The best way to learn is the built-in interactive tutorial: run **vimtutor** in your terminal, it takes about 30 minutes.

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
| **b** | Jump back to start of previous word |
| **0** | Jump to start of line |
| **^** | Jump to first non-blank character of line |
| **$** | Jump to end of line |
| **{ / }** | Jump to previous / next paragraph |
| **%** | Jump to the matching bracket |
| **Ctrl+d** | Scroll down half a page |
| **Ctrl+u** | Scroll up half a page |
| **gg** | Jump to first line of file |
| **G** | Jump to last line of file |
| **{number}G** | Jump to a specific line number |
| **gk / gj** | Move up / down one display line (wrapped lines) |

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
| **R** | Replace mode: type over existing characters |
| **:r {file}** | Insert contents of a file below the cursor |

## Editing
VIM combines operators like **d** (delete), **y** (yank/copy), and **c** (change) with motions like **w** (word) or **$** (end of line): **dw** deletes a word, **c$** rewrites the rest of the line.

| Key | Description |
|-----|-------------|
| **u** | Undo last change |
| **Ctrl+r** | Redo last undone change |
| **yy** | Yank (copy) the current line |
| **y{motion}** | Yank text covered by a motion (e.g. **yw** for a word) |
| **p** | Paste after cursor |
| **P** | Paste before cursor |
| **x** | Delete character under cursor |
| **r{char}** | Replace the character under the cursor |
| **dd** | Delete current line |
| **d{motion}** | Delete text covered by a motion (e.g. **dw** for a word) |
| **c{motion}** | Delete text and enter Insert mode |
| **J** | Join the next line onto the current one |
| **>> / <<** | Indent / unindent the current line |
| **.** | Repeat the last change |

> Deleted and yanked text both land in the same register, so **dd** then **p** moves a line.

## Counts & Text Objects
Prefix any command with a number to repeat it: **3dd** deletes three lines, **2w** jumps two words. Text objects describe what is *around* the cursor: **i** means inside, **a** includes the delimiters.

| Key | Description |
|-----|-------------|
| **ciw** | Change the word under the cursor |
| **diw** | Delete the word under the cursor |
| **di"** | Delete everything inside the quotes |
| **ci(** | Change everything inside the parentheses |
| **da(** | Delete the parentheses and their content |
| **yip** | Yank the current paragraph |

## Search and Replace
Press **/** or **?** in Normal mode to start a search. Replace commands use the **:** command line.

| Key | Description |
|-----|-------------|
| **/pattern** | Search forward for pattern |
| **?pattern** | Search backward for pattern |
| **n** | Jump to next match |
| **N** | Jump to previous match |
| `*` | Search forward for the word under the cursor |
| `#` | Search backward for the word under the cursor |
| **:s/foo/bar/** | Replace first occurrence of foo with bar on current line |
| **:s/foo/bar/g** | Replace all occurrences of foo with bar on current line |
| **:%s/foo/bar/g** | Replace all occurrences of foo with bar in the entire file |
| **:%s/foo/bar/gc** | Replace all in file, asking for confirmation each time |
| **:noh** | Clear search highlighting |

## Multiple Windows
VIM can split the screen to show multiple files at once. Window commands start with **Ctrl+w**.

| Key | Description |
|-----|-------------|
| **:split {file}** | Split horizontally and open file |
| **:vsplit {file}** | Split vertically and open file |
| **:sview {file}** | Split horizontally and open file as read-only |
| **Ctrl+w w** | Cycle to the next window |
| **Ctrl+w h j k l** | Move to the window in that direction |
| **Ctrl+w _** | Maximize current window height |
| **Ctrl+w =** | Make all windows equal size |
| **:hide** | Close the current window |
| **:only** | Close all windows except the current one |

Every open file lives in a buffer, whether it is visible or not.

| Key | Description |
|-----|-------------|
| **:ls** | List all open buffers |
| **:b {number}** | Switch to a buffer by its number |
| **:bn / :bp** | Switch to the next / previous buffer |
| **:bd** | Close (delete) the current buffer |
