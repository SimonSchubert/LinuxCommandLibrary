# TAGLINE

Query, compile and test XKB keymaps from the command line

# TLDR

**List** all available XKB rules, models, layouts, variants and options

```xkbcli list```

**Compile** the active system keymap and dump it to stdout

```xkbcli compile-keymap```

**Compile a keymap** with a specific layout/variant

```xkbcli compile-keymap --layout [us] --variant [dvorak]```

**Show how to type** a particular Unicode codepoint

```xkbcli how-to-type [0x00e9]```

**Interactively debug** XKB keymaps under **Wayland**

```xkbcli interactive-wayland```

**Interactively debug** XKB keymaps under **X11**

```xkbcli interactive-x11```

**Interactively debug** XKB keymaps reading from **evdev** (requires root)

```sudo xkbcli interactive-evdev```

**Print** the version of libxkbcommon

```xkbcli --version```

# SYNOPSIS

**xkbcli** _command_ [_arguments_]

**xkbcli** [**--help** | **--version**]

# PARAMETERS

**--help**
> Show usage and exit.

**--version**
> Print the libxkbcommon version and exit.

# SUBCOMMANDS

**compile-keymap**
> Compile an RMLVO (rules + model + layout + variant + options) keymap source into the keymap text format and print it. Accepts **--rules**, **--model**, **--layout**, **--variant**, **--options** and **--keymap**.

**compile-compose**
> Compile a Compose file and print the resulting Compose table.

**how-to-type** _codepoint_
> Show every keysym/key combination that produces the given Unicode codepoint (decimal, or **0x** hex).

**interactive-evdev**
> Interactive XKB debugger reading raw events from **/dev/input/eventN**; usually requires root or membership in the **input** group.

**interactive-x11**
> Interactive XKB debugger using the live X11 keymap.

**interactive-wayland**
> Interactive XKB debugger using the live Wayland keymap.

**list**
> Print all rules, models, layouts, variants and options known to libxkbcommon. Optionally filter with **--ruleset**.

# DESCRIPTION

**xkbcli** is the user-facing front-end shipped with **libxkbcommon**, the keymap library used by Wayland compositors, the X.Org server (since 1.20), GTK, Qt, EFL and most modern toolkits. It exposes the library's compilation, lookup and inspection APIs as a single multiplexed binary with sub-commands.

It is most often used in three ways. First, **xkbcli list** answers the question "which layouts/variants does my system know about?" — the same data shown by graphical keyboard pickers but in a machine-parseable form. Second, **xkbcli compile-keymap** reproduces exactly what a compositor or X server does when it compiles a keymap, which is invaluable when diagnosing why a custom layout is not being applied. Third, the **interactive-*** sub-commands print the live keysym, modifier state, group and Unicode codepoint of every keypress, making **xkbcli** the equivalent of **xev**(1) for the libxkbcommon era.

The tool relies on the system's **xkeyboard-config** data files (typically under **/usr/share/X11/xkb**), so its output reflects the keymaps that any libxkbcommon-based program would see.

# CAVEATS

**interactive-evdev** reads raw kernel input events and therefore needs read access to **/dev/input/event\***; on most distributions this means **root** or membership of the **input** group. **interactive-wayland** and **interactive-x11** are only built when their respective headers are available at compile time, so they may be missing on minimal installations. The **list** sub-command shows what is shipped on the system, not what is currently active — use the compositor or **setxkbmap -query** for that.

# HISTORY

**libxkbcommon** was forked from **libxkbfile**/**xkbcomp** in **2012** by **Daniel Stone** and **Ran Benita** to provide a modern, X-server-independent XKB implementation usable by Wayland compositors. The **xkbcli** umbrella tool was added later as a single entry point for the family of debugging utilities (replacing the per-tool **xkbcompose**, **xkbgetkeymap**, etc.). It is now distributed by every major Linux distribution as part of the **libxkbcommon-tools** / **libxkbcommon-utils** package.

# INSTALL

```apt: sudo apt install libxkbcommon-tools```

```apk: sudo apk add xkbcli```

```zypper: sudo zypper install libxkbcommon-tools```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[xkbcomp](/man/xkbcomp)(1), [setxkbmap](/man/setxkbmap)(1), [xev](/man/xev)(1), [localectl](/man/localectl)(1)
