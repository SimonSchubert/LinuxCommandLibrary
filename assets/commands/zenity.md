# TLDR

**Display** the default question dialog

```zenity --question```

**Display** an info dialog with a message

```zenity --info --text "[message]"```

**Display** a name/password form with custom separator

```zenity --forms --add-entry "[name_label]" --add-password "[password_label]" --separator ";"```

**Display** a file selection for directories only

```zenity --file-selection --directory```

**Display** a progress bar that updates

```(echo "#1"; sleep 1; echo "50"; echo "#2"; sleep 1; echo "100") | zenity --progress```

# SYNOPSIS

**zenity** [_options_]

# PARAMETERS

**--question**
> Display a question dialog with Yes/No buttons

**--info**
> Display an information dialog

**--warning**
> Display a warning dialog

**--error**
> Display an error dialog

**--file-selection**
> Display a file selection dialog

**--forms**
> Display a forms dialog

**--progress**
> Display a progress dialog

**--text _text_**
> Set dialog text

**--add-entry _label_**
> Add a text entry field (forms)

**--add-password _label_**
> Add a password field (forms)

**--directory**
> Allow only directory selection

**--separator _char_**
> Set output separator

# DESCRIPTION

**zenity** displays GTK+ dialogs from command-line scripts. It provides various dialog types including questions, information, file selection, progress bars, and forms.

Return values indicate user action: 0 for OK/Yes, 1 for Cancel/No, 5 for timeout, and -1 for errors. Form data is returned on stdout.

# CAVEATS

Requires a graphical environment (X11 or Wayland with XWayland). Dialog appearance depends on GTK theme. For KDE environments, consider **kdialog** as an alternative.

# SEE ALSO

[kdialog](/man/kdialog)(1), [dialog](/man/dialog)(1), [whiptail](/man/whiptail)(1)
