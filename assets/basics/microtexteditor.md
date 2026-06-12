# Micro Text Editor

## Getting Started
Micro is a modern terminal text editor with intuitive keybindings. If you know **Ctrl+S** to save and **Ctrl+Z** to undo, you already know the basics.
```[micro](/man/micro) textfile.txt```

| Key | Description |
|-----|-------------|
| **Ctrl+q** | Quit (or close the current tab/split) |
| **Ctrl+s** | Save current file |
| **Ctrl+o** | Open a file |
| **Ctrl+g** | Open the help menu |
| **Ctrl+e** | Open the command bar |
| **Alt+g** | Show what every key does in a bar at the bottom |

## Navigation
Standard arrow keys, Home, End, Page Up, and Page Down all work as expected. These shortcuts provide additional movement.

| Key | Description |
|-----|-------------|
| **Ctrl+Left** | Move to previous word |
| **Ctrl+Right** | Move to next word |
| **Alt+{** | Move to previous paragraph |
| **Alt+}** | Move to next paragraph |
| **Home** | Move to beginning of line |
| **End** | Move to end of line |
| **Ctrl+Home** | Move to start of file |
| **Ctrl+End** | Move to end of file |

Jump to a line with the command bar: press **Ctrl+e**, then type the goto command.
```goto 42```

## Selection
Hold **Shift** with any movement key to select text.

| Key | Description |
|-----|-------------|
| **Shift+Arrow** | Extend selection by one character or line |
| **Ctrl+Shift+Left** | Select to previous word |
| **Ctrl+Shift+Right** | Select to next word |
| **Shift+Home** | Select to beginning of line |
| **Shift+End** | Select to end of line |
| **Ctrl+a** | Select all text |

## Editing
Copy, cut, and paste use the familiar system shortcuts.

| Key | Description |
|-----|-------------|
| **Ctrl+z** | Undo |
| **Ctrl+y** | Redo |
| **Ctrl+c** | Copy selected text |
| **Ctrl+x** | Cut selected text |
| **Ctrl+v** | Paste from clipboard |
| **Ctrl+k** | Cut the current line |
| **Ctrl+d** | Duplicate the current line |
| **Tab** | Indent selection or insert tab |
| **Shift+Tab** | Unindent selection |
| **Ctrl+u** | Start/stop recording a macro |
| **Ctrl+j** | Play the recorded macro |

## Search and Replace
Search is incremental: matches highlight as you type.

| Key | Description |
|-----|-------------|
| **Ctrl+f** | Find |
| **Ctrl+n** | Find next match |
| **Ctrl+p** | Find previous match |
| **Alt+F** | Find literal (no regex) |

Replace runs from the command bar (**Ctrl+e**). It asks for confirmation at each match unless you add **-a**.
```replace "search" "replacement"```
```replace -a "search" "replacement"```

## Multiple Cursors
Edit several places at once. Type normally and every cursor applies the change; press **Escape** to return to a single cursor.

| Key | Description |
|-----|-------------|
| **Ctrl+Click** | Place an additional cursor |
| **Alt+n** | Spawn a cursor at the next match of the current word |
| **Alt+x** | Skip the current match |
| **Alt+p** | Remove the last added cursor |
| **Alt+c** | Remove all extra cursors |
| **Alt+m** | Spawn a cursor on every match |

## Tabs and Splits
Open files side by side or in tabs. Splits are created from the command bar (**Ctrl+e**).
```vsplit other.txt```
```hsplit notes.txt```
```tab third.txt```

| Key | Description |
|-----|-------------|
| **Ctrl+t** | Open a new tab |
| **Alt+,** | Switch to previous tab |
| **Alt+.** | Switch to next tab |
| **Ctrl+w** | Jump to the next split |
| **Ctrl+q** | Close the current split or tab |

## Useful Commands & Options
The command bar (**Ctrl+e**) also changes settings, permanently stored in ~/.config/micro/settings.json.
```set tabsize 4```
```set tabstospaces on```
```set ruler off```
```set colorscheme monokai```
```help defaultkeys```

| Key | Description |
|-----|-------------|
| **Ctrl+r** | Toggle line numbers (ruler) |
| **Ctrl+b** | Run a shell command |

## Mouse
Micro has built-in mouse support: click to place the cursor, drag to select text, scroll with the wheel, and double-click to select a word.
