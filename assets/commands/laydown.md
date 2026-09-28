# TAGLINE

keep track of what to say at your next daily standup

# TLDR

**Show** your current standup

```laydown```

Add items to the **DID** section

```laydown did "[item1]" "[item2]"```

Add an item to the **DOING** section

```laydown doing "[item]"```

Add a **blocker**

```laydown blocker "[item]"```

Add a topic for a **sidebar** discussion

```laydown sidebar "[item]"```

**Edit** the standup data directly (uses $EDITOR, else the given editor or vi)

```laydown --edit [nano]```

**Undo** the last added item

```laydown --undo```

**Archive** today's standup and start a fresh one

```laydown --archive```

**Clear** all items without archiving

```laydown --clear```

# SYNOPSIS

**laydown** [_options_]

**laydown** **did**|**doing**|**blocker**|**sidebar** "_item_" ["_item_"...]

# PARAMETERS

**did** _ITEMS_
> Add items to the DID section.

**doing** _ITEMS_
> Add items to the DOING section.

**blocker** _ITEMS_
> Add items to the BLOCKERS section.

**sidebar** _ITEMS_
> Add items to the SIDEBARS section.

**--clear**
> Remove all items from the standup.

**--edit** [_EDITOR_]
> Open the standup data file in **$EDITOR**; if it is unset, use the given editor (default **vi**).

**--undo**
> Remove the last added item.

**--archive**
> Save the standup to **archive/YYYY-MM-DD.txt** in the data directory and clear it (asks before overwriting an existing archive for today).

**--data-dir**
> Print the location of the laydown data directory.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**laydown** is a small command-line application that helps you remember what to say at your next daily standup meeting. Running it without arguments prints the standup, grouped into **DID**, **DOING**, **BLOCKERS** and **SIDEBARS** sections.

Items are stored in a data file in the user's data directory, so they persist until you clear them. Each argument after a section command is added as a separate item, so quote items that contain spaces.

# CAVEATS

Items are not cleared automatically after a standup; use **--archive** or **--clear** to start fresh. **$EDITOR** always takes precedence over the editor passed to **--edit**.

# HISTORY

laydown was written in **Rust** by Bobby Dorrance and is distributed via crates.io.

# SEE ALSO

[todo](/man/todo)(1), [task](/man/task)(1), [jrnl](/man/jrnl)(1)

# RESOURCES

```[Source code](https://github.com/badjr13/laydown)```

<!-- verified: 2026-09-29 -->
