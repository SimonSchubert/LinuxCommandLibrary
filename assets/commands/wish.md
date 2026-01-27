# TLDR

**Start interactive Tk shell**

```wish```

**Run a Tk script**

```wish [script.tcl]```

**Run script with arguments**

```wish [script.tcl] [arg1] [arg2]```

**Execute Tk commands directly**

```echo "[button .b -text Hello; pack .b]" | wish```

# SYNOPSIS

**wish** [_options_] [_script_] [_args_...]

# PARAMETERS

**-colormap** _new_
> Use new private colormap.

**-display** _display_
> X display to use.

**-geometry** _geometry_
> Initial window geometry.

**-name** _name_
> Use name as application name.

**-sync**
> Execute X server requests synchronously.

**-visual** _visual_
> Visual type for main window.

**-use** _id_
> Embed in window with given id.

**--**
> End of options; remaining args go to script.

# DESCRIPTION

**wish** is a Tcl interpreter extended with Tk toolkit commands for creating graphical interfaces. It reads Tcl/Tk commands from files or standard input and executes them, creating GUI windows and widgets.

When run without arguments, wish starts interactively with an empty main window and a "%" prompt for entering commands. Scripts can be made executable with #!/usr/bin/wish as the first line.

Tk provides widgets including buttons, labels, entries, listboxes, canvases, menus, and more. The geometry manager commands (pack, grid, place) control widget layout.

# INTERACTIVE

In interactive mode, wish displays "%" prompt. Commands are executed after complete statements. Prompts can be customized via tcl_prompt1 and tcl_prompt2 variables.

# CAVEATS

Requires X11 display. Tk applications look dated without theming. Some distributions use versioned names like wish8.6.

# HISTORY

**wish** was created by John Ousterhout alongside Tcl in the late 1980s. Tk was one of the first cross-platform GUI toolkits and influenced many later frameworks. Wish remains popular for quick GUI scripting and is used by tools like gitk.

# SEE ALSO

[tclsh](/man/tclsh)(1), [tk](/man/tk)(n), [gitk](/man/gitk)(1), [tkcon](/man/tkcon)(1)
