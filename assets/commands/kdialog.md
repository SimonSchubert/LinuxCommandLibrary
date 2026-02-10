# TAGLINE

displays KDE dialog boxes from shell scripts, enabling graphical user

# TLDR

Display **message box**

```kdialog --msgbox "message"```

Show **yes/no** question dialog

```kdialog --yesno "message"```

Show **warning** with yes/no/cancel

```kdialog --warningyesnocancel "message"```

Show **input** dialog

```kdialog --inputbox "message" "default"```

Show **password** input dialog

```kdialog --password "message"```

Show **combo box** dropdown

```kdialog --combobox "message" "item1" "item2" "item3"```

Open **file chooser** dialog

```kdialog --getopenfilename```

Show **progress bar** dialog

```kdialog --progressbar "message"```

# SYNOPSIS

**kdialog** [_options_] [_arguments_]

# DESCRIPTION

**kdialog** displays KDE dialog boxes from shell scripts, enabling graphical user interaction in command-line scripts. It provides various dialog types including message boxes, input dialogs, file choosers, and progress bars.

# PARAMETERS

**--msgbox TEXT**
> Display a message box with OK button

**--yesno TEXT**
> Display yes/no dialog; returns 0 for yes, 1 for no

**--yesnocancel TEXT**
> Display yes/no/cancel dialog; returns 0, 1, or 2

**--warningyesno TEXT**
> Display warning with yes/no buttons

**--warningyesnocancel TEXT**
> Display warning with yes/no/cancel buttons

**--inputbox TEXT [DEFAULT]**
> Display input dialog; prints input to stdout

**--password TEXT**
> Display password input dialog

**--combobox TEXT ITEM...**
> Display dropdown selection dialog

**--getopenfilename [DIR] [FILTER]**
> Display file open dialog

**--getsavefilename [DIR] [FILTER]**
> Display file save dialog

**--getexistingdirectory [DIR]**
> Display directory selection dialog

**--progressbar TEXT [TOTAL]**
> Display progress bar; returns D-Bus reference

**--title TEXT**
> Set dialog window title

**--icon ICON**
> Set dialog icon

# CAVEATS

kdialog requires a running KDE/Qt environment. Exit codes vary by dialog type; check return values for user selections. Progress bars return D-Bus references for updating progress from scripts.

# HISTORY

**kdialog** is part of the KDE base applications, providing script access to KDE's native dialog system. It is the KDE equivalent of zenity for GTK environments.

# SEE ALSO

[zenity](/man/zenity)(1), [dialog](/man/dialog)(1), [whiptail](/man/whiptail)(1)
