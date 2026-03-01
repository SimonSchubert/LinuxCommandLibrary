# Micro Text Editor

## Getting Started
Micro is a modern terminal text editor with intuitive keybindings. If you know **Ctrl+S** to save and **Ctrl+Z** to undo, you already know the basics.
```[micro](/man/micro) textfile.txt```

| Key | Description |
|-----|-------------|
| **Ctrl+q** | Quit micro |
| **Ctrl+s** | Save current file |
| **Ctrl+o** | Open a file |
| **Ctrl+g** | Open the help menu |
| **Ctrl+e** | Open the command bar |

## Navigation
Standard arrow keys, Home, End, Page Up, and Page Down all work as expected. These shortcuts provide additional movement.

| Key | Description |
|-----|-------------|
| **Ctrl+Left** | Move to previous word |
| **Ctrl+Right** | Move to next word |
| **Ctrl+Up** | Scroll up without moving cursor |
| **Ctrl+Down** | Scroll down without moving cursor |
| **Home** | Move to beginning of line |
| **End** | Move to end of line |
| **Ctrl+Home** | Move to start of file |
| **Ctrl+End** | Move to end of file |

## Selection
Hold **Shift** with any movement key to select text. These shortcuts select larger regions.

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
| **Ctrl+u** | Upper/lowercase selection toggle |
| **Tab** | Indent selection or insert tab |
| **Backtab** | Unindent selection |

## Search and Replace
Micro supports incremental search and regex-aware find and replace.

| Key | Description |
|-----|-------------|
| **Ctrl+f** | Find |
| **Ctrl+n** | Find next match |
| **Ctrl+p** | Find previous match |
| **Ctrl+r** | Toggle find and replace |
| **Alt+F** | Find literal (no regex) |

## Tabs and Splits
Micro supports multiple open files in tabs and split views.

| Key | Description |
|-----|-------------|
| **Ctrl+t** | Open a new tab |
| **Alt+,** | Switch to previous tab |
| **Alt+.** | Switch to next tab |
| **Ctrl+w** | Close current tab |
| **Ctrl+b** | Run a shell command |
| **Ctrl+j** | Jump to a matching bracket |
| **Ctrl+l** | Toggle line numbers |
| **Alt+g** | Toggle gutter |

## Mouse
Micro has built-in mouse support. Click to place the cursor, scroll to navigate, and drag to select text.

| Key | Description |
|-----|-------------|
| **Mouse wheel** | Scroll up and down |
| **Click** | Place cursor |
| **Drag** | Select text |
| **Ctrl+Click** | Place additional cursor (multi-cursor mode) |
| **Alt+n** | Spawn a multi-cursor at next search match |
| **Alt+m** | Spawn a multi-cursor on every search match |
| **Alt+p** | Remove the last multi-cursor |
| **Alt+c** | Remove all multi-cursors |
| **Alt+x** | Skip current multi-cursor match |

## Emacs-style Navigation
These alternative keybindings are available for Emacs users.

| Key | Description |
|-----|-------------|
| **Alt+f** | Move forward one word |
| **Alt+b** | Move backward one word |
| **Alt+a** | Move to beginning of line |
| **Alt+e** | Move to end of line |
