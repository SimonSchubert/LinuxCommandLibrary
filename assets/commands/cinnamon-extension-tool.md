# TAGLINE

Create skeleton Cinnamon desktop extensions

# TLDR

**Create a new extension** interactively

```cinnamon-extension-tool --create-extension```

**Show usage**

```cinnamon-extension-tool --help```

# SYNOPSIS

**cinnamon-extension-tool** [**--create-extension**]

# DESCRIPTION

**cinnamon-extension-tool** is a small Python script from older Cinnamon releases. With **--create-extension** it prompts for a name, description and UUID, writes **extension.js**, **metadata.json** and a sample stylesheet to **~/.local/share/cinnamon/extensions/\<uuid\>/**, then opens **extension.js** in the default editor.

The tool's man page describes it as running a graphical extension manager, but the script itself only implements the creation flow.

# PARAMETERS

**--create-extension**
> Create a new Cinnamon extension from the built-in sample.

**-h**, **--help**
> Show usage information.

# CAVEATS

No longer shipped: the script is present in Cinnamon up to 3.0 and absent from 3.2 onward. On current systems, manage extensions with **cinnamon-settings extensions** and applets with **cinnamon-settings applets**.

# HISTORY

**cinnamon-extension-tool** was part of the Cinnamon source tree from its early releases (its man page is dated **2012**) until it was dropped after Cinnamon 3.0.

# SEE ALSO

[cinnamon](/man/cinnamon)(1), [cinnamon-launcher](/man/cinnamon-launcher)(1)

# RESOURCES

```[Source code](https://github.com/linuxmint/cinnamon)```

<!-- verified: 2026-11-09 -->
