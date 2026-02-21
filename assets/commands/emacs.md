# TAGLINE

extensible, customizable text editor and computing environment

# TLDR

**Open Emacs** with a file

```emacs [path/to/file]```

**Open a file** at a specific line number

```emacs +[42] [path/to/file]```

**Open a file** at a specific line and column

```emacs +[42]:[10] [path/to/file]```

**Run Emacs in terminal mode** (no GUI)

```emacs -nw [path/to/file]```

**Start Emacs without loading init files**

```emacs -q```

**Evaluate an Elisp expression** and exit

```emacs --batch --eval '(message "Hello")'```

**Run Emacs as a daemon** for fast client connections

```emacs --daemon```

**Connect to an Emacs daemon**

```emacsclient [path/to/file]```

# SYNOPSIS

**emacs** [_options_] [_file_...]

**emacs** [_+line_] [_+line:column_] [_file_...]

# PARAMETERS

**-nw**, **--no-window-system**
> Run in terminal mode without GUI (text terminal)

**-q**, **--no-init-file**
> Do not load the user init file (~/.emacs)

**--no-site-file**
> Do not load the site-wide startup file

**-u** _USER_, **--user** _USER_
> Load specified user's init file

**-t** _FILE_, **--terminal** _FILE_
> Use specified file as terminal

**--debug-init**
> Enable Emacs Lisp debugger during init file processing

**--batch**
> Run in batch mode (non-interactive)

**--script** _FILE_
> Run specified file as an Emacs Lisp script

**--eval** _EXPRESSION_
> Evaluate Emacs Lisp expression

**-l** _FILE_, **--load** _FILE_
> Load specified Emacs Lisp file

**-f** _FUNCTION_, **--funcall** _FUNCTION_
> Execute specified Emacs Lisp function

**--daemon**
> Start Emacs as a background daemon

**-Q**, **--quick**
> Start with minimal configuration (implies -q --no-site-file --no-splash)

**--geometry** _WIDTHxHEIGHT+X+Y_
> Set window geometry (X11)

**-fs**, **--fullscreen**
> Start in fullscreen mode

**-fw**, **--fullwidth**
> Make window as wide as the screen

**-fh**, **--fullheight**
> Make window as tall as the screen

**-fg** _COLOR_
> Set foreground color

**-bg** _COLOR_
> Set background color

**-d** _DISPLAY_, **--display** _DISPLAY_
> Use specified X display

**--version**
> Display version information

**--help**
> Display help information

# DESCRIPTION

**emacs** is an extensible, customizable, self-documenting text editor and computing environment. Far beyond a simple editor, it includes facilities for email, file management, terminal emulation, web browsing, and thousands of other functions through its extension system.

Emacs is built around Emacs Lisp (Elisp), a full programming language that allows users to customize and extend virtually every aspect of the editor. User configurations are stored in **~/.emacs** or **~/.emacs.d/init.el**.

The editor operates in different modes depending on the file type, providing syntax highlighting, indentation, and mode-specific commands. Major modes handle different file types, while minor modes add optional features. The built-in help system is accessed with **C-h** (Ctrl+h) or **F1**.

# CONFIGURATION

**~/.emacs**
> User initialization file for Emacs configuration and customization.

**~/.emacs.d/init.el**
> Alternative location for user initialization file, preferred for organizing multiple config files.

**~/.emacs.d/**
> Directory for packages, themes, and additional Elisp files.

# CAVEATS

Emacs has a steep learning curve with its extensive keyboard shortcuts. The default keybindings differ from most modern applications (e.g., **C-x C-s** to save, **C-x C-c** to quit). Running with **-q** can help troubleshoot configuration issues. Large files may load slowly without proper configuration. GUI and terminal modes have different capabilities.

# HISTORY

The original EMACS was created at MIT in **1976** by **David A. Moon**, **Guy L. Steele Jr.**, and **Richard Stallman**, evolving from editor macros for the TECO editor. GNU Emacs, the most widely used implementation, was first released in **1985** and became the flagship project of the GNU Project. The name originally stood for "**E**ditor **MAC**ro**S**". Emacs inspired the free software movement and remains one of the oldest actively developed software projects. Its rival **vi** sparked the famous "editor wars" among Unix users.

# SEE ALSO

[vim](/man/vim)(1), [nano](/man/nano)(1), [emacsclient](/man/emacsclient)(1), [vi](/man/vi)(1)
