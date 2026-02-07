# TAGLINE

Manage Cinnamon desktop applets, desklets, and extensions

# TLDR

**List all installed extensions**

```cinnamon-extension-tool --list --extension```

**List all installed applets**

```cinnamon-extension-tool --list --applet```

**List all installed desklets**

```cinnamon-extension-tool --list --desklet```

**Enable an extension by UUID**

```cinnamon-extension-tool --enable [extension-uuid]```

**Disable an extension by UUID**

```cinnamon-extension-tool --disable [extension-uuid]```

**Reload the Cinnamon shell**

```cinnamon-extension-tool --reload```

# SYNOPSIS

**cinnamon-extension-tool** [**--list**] [**--enable** _UUID_] [**--disable** _UUID_] [**--reload**] [**--applet**|**--desklet**|**--extension**|**--lnf**]

# DESCRIPTION

**cinnamon-extension-tool** manages Cinnamon "spices" (applets, desklets, extensions, and themes) from the command line. It provides functionality for listing, enabling, disabling, and reloading desktop components without using the graphical settings interface.

Each spice is identified by a unique UUID, which can be obtained from the **--list** output. Enabled items are marked with an asterisk (*).

# PARAMETERS

**--list**
> List installed spices of the specified type

**--enable** _UUID_
> Enable the spice with the specified UUID

**--disable** _UUID_
> Disable the spice with the specified UUID

**--reload**
> Reload the Cinnamon shell

**Spice type selectors:**

**--applet**
> Target panel applets

**--desklet**
> Target desktop widgets

**--extension**
> Target shell extensions

**--lnf**
> Target look & feel themes

# CAVEATS

Requires an active Cinnamon desktop session to communicate with. UUIDs are case-sensitive. Changes typically apply immediately, though some may require a shell reload or logout.

# HISTORY

**cinnamon-extension-tool** was introduced in **Cinnamon 2.4** (2014) by the Linux Mint team to provide command-line management of Cinnamon spices, similar to GNOME's extension CLI tools.

# SEE ALSO

[cinnamon](/man/cinnamon)(1), [cinnamon-settings](/man/cinnamon-settings)(1)
