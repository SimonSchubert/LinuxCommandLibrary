# TAGLINE

GNOME Shell integrated debugger and inspector

# TLDR

**Open the Looking Glass debugger** from the GNOME Shell run dialog

```> Alt+F2, type "lg", press Enter```

**Enable Looking Glass on systems where it is hidden**

```gsettings set org.gnome.shell development-tools true```

**Re-disable Looking Glass**

```gsettings set org.gnome.shell development-tools false```

**Reference the most recent evaluator result inside Looking Glass**

```> it```

**Recall an earlier numbered result inside Looking Glass**

```> r([number])```

**Slow GNOME Shell animations for debugging**

```> St.set_slow_down_factor([factor])```

# SYNOPSIS

**lg** _(typed into the GNOME Shell run dialog)_

# DESCRIPTION

**Looking Glass** is the integrated debugger, inspector, and JavaScript REPL of **GNOME Shell**. It is opened from inside a running GNOME session by pressing **Alt+F2** and entering the keyword **lg**. It is intended for debugging the shell itself and writing or troubleshooting GNOME Shell extensions.

The interface offers four panes. The **Evaluator** is an interactive JavaScript prompt with full access to the GNOME Shell process, including the **St**, **Clutter**, **Meta**, and **GLib** APIs. The **Windows** pane lists open windows. The **Extensions** pane shows installed shell extensions and links to their source. The **Errors** pane displays logged errors (in newer releases these are typically routed to **journalctl**).

A **picker tool** in the top-left lets the user click a UI element on screen to retrieve the corresponding actor in the evaluator for inspection.

Press **Esc** in the evaluator pane to dismiss Looking Glass.

# EVALUATOR HELPERS

**it**
> Reference the most recently evaluated expression.

**r(_n_)**
> Reference the result with index _n_.

**St.set_slow_down_factor(_f_)**
> Multiply animation durations by _f_ (>1 makes them slower); useful when debugging transitions.

# CONFIGURATION

Looking Glass is exposed to GNOME Shell through the **org.gnome.shell** GSettings schema. Set **development-tools** to **true** to enable it on distributions where it is hidden by default. Command history is persisted to dconf.

# CAVEATS

Not a stand-alone CLI tool: **lg** is a keyword interpreted by GNOME Shell's run dialog, not a binary in **PATH**. Available only inside a running GNOME Shell session (X11 or Wayland). It runs JavaScript directly inside the shell process, so a buggy snippet can freeze or crash the desktop session.

# HISTORY

Looking Glass was introduced with **GNOME Shell 3.0** in **April 2011** as an introspection tool inspired by Firebug, providing extension authors and shell developers with a live JavaScript console into a running session. It has remained part of GNOME Shell across all subsequent releases.

# SEE ALSO

[gsettings](/man/gsettings)(1), [dconf](/man/dconf)(1)
