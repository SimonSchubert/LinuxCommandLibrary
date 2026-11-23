# TAGLINE

GNOME Shell integrated debugger and inspector

# TLDR

**Open the Looking Glass debugger** from the GNOME Shell run dialog

```> Alt+F2, type "lg", press Enter```

**Re-enable Looking Glass** if it was disabled (enabled by default)

```gsettings set org.gnome.shell development-tools true```

**Disable Looking Glass** and the other Alt+F2 developer commands

```gsettings set org.gnome.shell development-tools false```

**Reference the most recent evaluator result inside Looking Glass**

```> it```

**Recall an earlier numbered result inside Looking Glass**

```> r([number])```

**Inspect** the actor under the given screen coordinates

```> inspect([x], [y])```

**Slow GNOME Shell animations for debugging**

```> St.Settings.get().slow_down_factor = [5]```

# SYNOPSIS

**lg** _(typed into the GNOME Shell run dialog)_

# DESCRIPTION

**Looking Glass** is the integrated debugger, inspector, and JavaScript REPL of **GNOME Shell**. It is opened from inside a running GNOME session by pressing **Alt+F2** and entering the keyword **lg**. It is intended for debugging the shell itself and writing or troubleshooting GNOME Shell extensions.

The interface offers five tabs. The **Evaluator** is an interactive JavaScript prompt with full access to the GNOME Shell process, including the **St**, **Clutter**, **Meta**, **Shell**, **Gio** and **GLib** APIs. The **Windows** tab lists open windows. The **Extensions** tab shows installed shell extensions, their state and errors. The **Actors** tab shows the scene graph as a tree. The **Flags** tab toggles Clutter and Mutter debug flags. Shell log output and errors go to the system journal (**journalctl /usr/bin/gnome-shell**).

A **picker tool** in the top-left lets the user click a UI element on screen to retrieve the corresponding actor in the evaluator for inspection.

Press **Esc** in the evaluator pane to dismiss Looking Glass.

# EVALUATOR HELPERS

**it**
> Reference the most recently evaluated expression.

**r(_n_)**
> Reference the result with index _n_.

**inspect(_x_, _y_)**
> Return the actor at the given stage coordinates.

**St.Settings.get().slow_down_factor = _f_**
> Multiply animation durations by _f_ (>1 makes them slower); useful when debugging transitions. The toolbar also has a slow-down toggle.

# CONFIGURATION

Looking Glass is exposed to GNOME Shell through the **org.gnome.shell** GSettings schema. The **development-tools** key (default **true**) enables Looking Glass and the other internal Alt+F2 commands (**rt** to reload the theme, **debugexit**). Evaluator history is stored in the **looking-glass-history** key.

# CAVEATS

Not a stand-alone CLI tool: **lg** is an internal command interpreted by GNOME Shell's run dialog, not a binary in **PATH**. Available only inside a running GNOME Shell session (X11 or Wayland). It runs JavaScript directly inside the shell process, so a buggy snippet can freeze or crash the desktop session.

# HISTORY

Looking Glass was introduced with **GNOME Shell 3.0** in **April 2011** as an introspection tool inspired by Firebug, providing extension authors and shell developers with a live JavaScript console into a running session. It has remained part of GNOME Shell across all subsequent releases.

# SEE ALSO

[gsettings](/man/gsettings)(1), [dconf](/man/dconf)(1)

# RESOURCES

```[Source code](https://gitlab.gnome.org/GNOME/gnome-shell)```

```[Documentation](https://gjs.guide/extensions/development/debugging.html)```

<!-- verified: 2026-11-23 -->
