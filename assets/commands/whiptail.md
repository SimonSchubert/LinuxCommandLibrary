# TLDR

Display a simple **message** box

```whiptail --title "[title]" --msgbox "[message]" [height] [width]```

Display a **yes/no** choice

```whiptail --title "[title]" --yesno "[message]" [height] [width]```

**Customize** yes/no button text

```whiptail --title "[title]" --yes-button "[text]" --no-button "[text]" --yesno "[message]" [height] [width]```

Display a **text input** box

```result=$(whiptail --title "[title]" --inputbox "[message]" [height] [width] [default] 3>&1 1>&2 2>&3)```

Display a **password** input box

```result=$(whiptail --title "[title]" --passwordbox "[message]" [height] [width] 3>&1 1>&2 2>&3)```

Display a **menu** with choices

```result=$(whiptail --title "[title]" --menu "[message]" [height] [width] [menu_height] "val1" "text1" "val2" "text2" 3>&1 1>&2 2>&3)```

# SYNOPSIS

**whiptail** [**--title** _title_] [**--backtitle** _backtitle_] _box-type_ [_box-options_] _height_ _width_

# PARAMETERS

**--title** _title_
> Dialog title

**--backtitle** _text_
> Background title

**--msgbox** _text_ _height_ _width_
> Display message with OK button

**--yesno** _text_ _height_ _width_
> Display yes/no dialog

**--inputbox** _text_ _height_ _width_ [_init_]
> Text input dialog

**--passwordbox** _text_ _height_ _width_
> Password input (hidden text)

**--menu** _text_ _height_ _width_ _menu-height_ [_tag_ _item_]...
> Selection menu

**--checklist** _text_ _height_ _width_ _list-height_ [_tag_ _item_ _status_]...
> Multiple choice checklist

**--radiolist** _text_ _height_ _width_ _list-height_ [_tag_ _item_ _status_]...
> Radio button list

**--gauge** _text_ _height_ _width_ _percent_
> Progress bar

**--yes-button** _text_
> Custom yes button label

**--no-button** _text_
> Custom no button label

# DESCRIPTION

**whiptail** displays text-based dialog boxes from shell scripts, providing a user-friendly interface for input and selection. It creates ncurses-based dialogs that work in terminal environments, supporting various dialog types including messages, input boxes, menus, and progress bars.

Output from input dialogs goes to stderr, requiring file descriptor redirection (3>&1 1>&2 2>&3) to capture in shell variables. Exit codes indicate user choices (0 for OK/Yes, 1 for Cancel/No).

# CAVEATS

Dialog dimensions must be specified in characters and should fit the terminal. Results go to stderr, requiring fd redirection for capture. A lightweight alternative to **dialog** with fewer features but smaller dependencies.

# HISTORY

Created as a lightweight, newt-based reimplementation of the **dialog** utility. Part of the **newt** library developed by Red Hat. Commonly used in Debian installer and system configuration scripts due to its small footprint.

# SEE ALSO

[dialog](/man/dialog)(1), [zenity](/man/zenity)(1), [gum](/man/gum)(1)
