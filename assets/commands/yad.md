# TAGLINE

GTK dialog tool for shell scripts

# TLDR

**Display an info dialog**

```yad --info --text="[Message text]"```

**Show a file selection dialog**

```yad --file --title="[Select a file]"```

**Display a text entry dialog**

```yad --entry --text="[Enter your name:]"```

**Create a form** with multiple fields

```yad --form --field="[Name]" --field="[Email]" --field="[Age]:NUM"```

**Show a list selection dialog**

```yad --list --column="[ID]" --column="[Name]" [1] "[Alice]" [2] "[Bob]"```

**Display a progress bar** from stdin

```[command] | yad --progress --text="[Processing...]" --auto-close```

**Create a calendar dialog**

```yad --calendar --title="[Select date]"```

**Show a notification icon** in system tray

```yad --notification --image="[icon-name]" --text="[Tooltip text]"```

# SYNOPSIS

**yad** [_--info_|_--warning_|_--error_|_--question_] [_--entry_] [_--file_] [_--form_] [_--list_] [_--progress_] [_--calendar_] [_--notification_] [_options_]

# PARAMETERS

**--info**
> Display an information dialog.

**--warning**
> Display a warning dialog.

**--error**
> Display an error dialog.

**--question**
> Display a question dialog with Yes/No buttons.

**--entry**
> Display a text entry dialog.

**--file**
> Display a file selection dialog.

**--directory**
> Display a directory selection dialog.

**--form**
> Display a form with multiple input fields.

**--list**
> Display a list/table selection dialog.

**--progress**
> Display a progress bar dialog.

**--calendar**
> Display a calendar date selection dialog.

**--color**
> Display a color selection dialog.

**--font**
> Display a font selection dialog.

**--notification**
> Display a system tray notification icon.

**--text** _string_
> Set the dialog text.

**--title** _string_
> Set the dialog window title.

**--width** _n_
> Set the dialog width.

**--height** _n_
> Set the dialog height.

**--field** _label[:type]_
> Add a field to a form (types: TEXT, NUM, CHK, CB, etc.).

**--column** _name_
> Add a column to list dialog.

**--auto-close**
> Close dialog when progress reaches 100%.

**--button** _label:action_
> Add custom button.

**--separator** _char_
> Set output field separator.

# DESCRIPTION

**YAD** (Yet Another Dialog) is a powerful GTK+ dialog tool for creating graphical dialogs from shell scripts. It is a fork and enhancement of Zenity with significantly more features and customization options.

YAD supports numerous dialog types: message boxes, file/directory selection, forms, lists, progress bars, calendars, color pickers, font selectors, and system tray notifications. Forms can include various field types including text, numbers, checkboxes, combo boxes, file choosers, and more.

Dialog output is written to stdout, making it easy to capture user input in shell scripts. The exit code indicates which button was pressed. Custom buttons can be defined with specific return codes or actions.

For complex interfaces, YAD supports multi-pane layouts with tabs and notebooks. The **--plug** and **--tabnum** options allow embedding multiple dialogs into a single window. HTML content can be displayed using the **--html** option with WebKit support.

# CAVEATS

Requires GTK+ 3 libraries. Some features like HTML rendering require WebKit. Dialog appearance varies with GTK theme. Complex forms may require careful escaping of special characters. System tray support depends on desktop environment compatibility.

# HISTORY

**YAD** was created by Victor Ananjevsky as an enhanced fork of Zenity. Development began around **2008** to address limitations in Zenity and add features needed for more sophisticated shell script GUIs. The project has been actively maintained with regular releases adding new dialog types and options.

# SEE ALSO

[zenity](/man/zenity)(1), [dialog](/man/dialog)(1), [kdialog](/man/kdialog)(1), [whiptail](/man/whiptail)(1)
