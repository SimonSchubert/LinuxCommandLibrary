# TAGLINE

text-mode disk usage treemap visualizer

# TLDR

Scan the **current directory**

```leaves```

Scan a **path**

```leaves ~/Documents```

Include **hidden** and ignored files

```leaves -A /var```

Scan root with **exclusions** for virtual filesystems

```leaves -A -d 3 / '!/proc' '!/tmp' '!/run' '!/sys' '!/dev'```

Open with **x-ray** mode (group by file type first)

```leaves -x ~/Projects```

# SYNOPSIS

**leaves** [_OPTIONS_] [_PATH_] [_OVERRIDES_...]

# PARAMETERS

**PATH**
> Root path to scan (default: current directory)

**OVERRIDES**
> Git-style globs; prefix with **!** to exclude

**-d**, **--max-depth** _n_
> Maximum depth kept in memory; deeper trees become summary nodes (default 5)

**-x**, **--xray**
> Group files by type at the top level, then split by directory

**-A**, **--include-all**
> Do not automatically skip any files; only overrides apply

**-H**, **--include-hidden**
> Include hidden files and folders

**-I**, **--include-ignored**
> Include files matching **.ignore** rules

**-G**, **--include-gitignored**
> Include files matching **.gitignore** rules

**-E**, **--include-gitexcluded**
> Include files listed in **.git/info/exclude**

**-h**, **--help**
> Print help

**-V**, **--version**
> Print version

# DESCRIPTION

**leaves** is a terminal disk usage analyzer inspired by WinDirStat and QDirStat. After scanning a directory tree, it draws a nested rectangle treemap where area is proportional to size, so large files and directories stand out immediately over SSH or on headless systems where GUI tools are unavailable.

The UI combines a collapsible explorer sidebar with a central treemap. Files are colored by extension and directories by name. Keyboard and mouse navigation support focusing into a directory, expanding or deflating detail, and switching x-ray mode (group by file type first). Depth summarization groups small or deep entries so millions of files remain usable.

By default, hidden paths and **.gitignore** / **.ignore** patterns are skipped. Symbolic links are not followed (they do not add local disk use). Hard links are not de-duplicated and may be counted more than once.

# CONFIGURATION

Leaves reads **$XDG_CONFIG_HOME/leaves/setings.toml** (typically **~/.config/leaves/setings.toml** on Linux; note the project's spelling). Most settings can also be set via **LEAVES_** environment variables.

**dark_mode** (true/false) — lighter colors for dark terminals (**LEAVES_DARK_MODE**)

**color_shift** (0.0–1.0) — lighten or darken palettes (**LEAVES_COLOR_SHIFT**)

**colors** — theme name: fall, spring, greys, mono, or a custom theme (**LEAVES_COLORS**)

**dir_style** — thick or plain directory borders (**LEAVES_DIR_STYLE**)

Custom themes can define **dirs** and **files** color arrays (hex, named, rgb/hsl).

# CAVEATS

Character-cell treemaps are coarser than GUI tools; deeply nested items are under-represented relative to top-level siblings because borders consume cells. Scanning **/** without excluding **/proc**, **/sys**, **/dev**, and similar virtual filesystems can produce misleading sizes. Very deep **--max-depth** loads more of the tree into memory and can slow mode switches.

# HISTORY

**leaves** is a Rust TUI project by **patonw**, released as free software under the MPL-2.0 license.

# SEE ALSO

[ncdu](/man/ncdu)(1), [du](/man/du)(1), [df](/man/df)(1), [tree](/man/tree)(1)

# RESOURCES

```[Source code](https://github.com/patonw/leaves)```

<!-- verified: 2026-07-16 -->
