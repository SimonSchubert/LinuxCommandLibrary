# Pico Text Editor

## Getting Started
Pico is the built-in editor from the Pine email client and the predecessor of Nano. It shows available shortcuts at the bottom of the screen; the **^** symbol means Ctrl.
```[pico](/man/pico) textfile.txt```
```[pico](/man/pico) +25 textfile.txt```

| Key | Description |
|-----|-------------|
| **Ctrl+g** | Display help text |
| **Ctrl+x** | Exit pico (prompts to save if modified) |

Many systems no longer ship pico; its open-source successor **nano** uses the same keybindings, and **pico** is often just an alias for it.

## Navigation
Use arrow keys for basic movement, or these Emacs-style shortcuts.

| Key | Description |
|-----|-------------|
| **Ctrl+f** | Move forward one character |
| **Ctrl+b** | Move backward one character |
| **Ctrl+n** | Move to next line |
| **Ctrl+p** | Move to previous line |
| **Ctrl+a** | Move to beginning of line |
| **Ctrl+e** | Move to end of line |
| **Ctrl+v** | Scroll down one page |
| **Ctrl+y** | Scroll up one page |
| **Ctrl+c** | Show current cursor position |

## File Operations
Pico prompts for a filename when saving.

| Key | Description |
|-----|-------------|
| **Ctrl+o** | Write out (save) the current file |
| **Ctrl+r** | Read (insert) another file into the current one |

## Editing
Use **Ctrl+^** to start selecting text, then move the cursor to extend the selection.

| Key | Description |
|-----|-------------|
| **Ctrl+d** | Delete the character under the cursor |
| **Ctrl+^** | Mark text (start selection) |
| **Ctrl+k** | Cut the current line (or selected text) |
| **Ctrl+u** | Paste (uncut) the last cut text |
| **Ctrl+i** | Insert a tab |
| **Ctrl+j** | Justify the current paragraph |
| **Ctrl+t** | Spell check |
| **Ctrl+l** | Refresh the display |

## Search
**Ctrl+W** stands for "Where is". Press **Enter** at the prompt to repeat the previous search.

| Key | Description |
|-----|-------------|
| **Ctrl+w** | Search for text |
