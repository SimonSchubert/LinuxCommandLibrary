# TAGLINE

text-mode dialog boxes for shell scripts

# TLDR

Display a **message**

```dialog --msgbox "[Message]" [height] [width]```

Prompt for **text input**

```dialog --inputbox "[Enter text:]" 8 40 2>[output.txt]```

Prompt for **yes/no** question

```dialog --yesno "[Continue?]" 7 40```

Display **help**

```dialog```

# SYNOPSIS

**dialog** [_options_] _box-type_ [_box-options_]

# DESCRIPTION

**dialog** displays dialog boxes from shell scripts, providing a user-friendly text-based interface for interactive scripts. It supports various widget types including message boxes, input boxes, menus, checklists, radio lists, progress bars, and file selection dialogs.

The program uses the ncurses library to create pseudo-graphical interfaces in text terminals. This enables shell scripts to present professional-looking user interfaces without requiring a graphical environment.

Output is written to stderr (or a specified file), while exit status indicates which button was pressed (0 for OK/Yes, 1 for Cancel/No, 255 for ESC). This design allows scripts to capture both user selections and continue using stdout for other purposes. dialog is widely used in system administration scripts, installation programs, and configuration utilities.

# PARAMETERS

**--msgbox** _text_ _height_ _width_
> Display message with OK button

**--yesno** _text_ _height_ _width_
> Yes/No question dialog

**--inputbox** _text_ _height_ _width_ [_init_]
> Text input dialog

**--menu** _text_ _height_ _width_ _menu-height_ _tag_ _item_...
> Menu selection

**--checklist** _text_ _height_ _width_ _list-height_ _tag_ _item_ _status_...
> Checkbox selection

**--radiolist**
> Radio button selection

**--title** _title_
> Set dialog title

# CAVEATS

Output goes to stderr by default; redirect with 2>file. Exit status: 0=OK/Yes, 1=Cancel/No, 255=ESC. For graphical dialogs, see zenity or kdialog.

# SEE ALSO

[whiptail](/man/whiptail)(1), [zenity](/man/zenity)(1), [gum](/man/gum)(1)
