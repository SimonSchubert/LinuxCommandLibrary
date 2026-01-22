# TLDR

**Start CopyQ** in the system tray

```copyq```

**Show the clipboard history** window

```copyq show```

**Copy text** to clipboard

```copyq copy "[text to copy]"```

**Paste the clipboard** contents

```copyq paste```

**Read current clipboard** content

```copyq clipboard```

**Read item at specific index** (0 is most recent)

```copyq read [0]```

**Add text to clipboard history**

```copyq add "[text to add]"```

**Select item from history** by index

```copyq select [5]```

# SYNOPSIS

**copyq** [_command_] [_arguments_]

# PARAMETERS

**show**
> Show the main clipboard history window.

**hide**
> Hide the main window.

**toggle**
> Toggle the main window visibility.

**copy** _TEXT_
> Copy text to the clipboard.

**paste**
> Paste current clipboard content.

**clipboard**
> Print current clipboard content.

**read** _INDEX_
> Read clipboard history item at index.

**add** _TEXT_
> Add text to clipboard history.

**select** _INDEX_
> Copy item at index to clipboard.

**remove** _INDEX_
> Remove item at index from history.

**count**
> Print number of items in clipboard history.

**exit**
> Exit CopyQ.

# DESCRIPTION

**CopyQ** is an advanced clipboard manager with editing and scripting features. It monitors the system clipboard and stores a searchable history of copied content, supporting text, images, and other data types.

The application provides both a GUI for browsing history and a powerful command-line interface for scripting clipboard operations. Items can be organized into tabs, tagged, and filtered. Custom commands and scripts can be triggered based on clipboard content.

CopyQ supports synchronization across devices, encrypted storage, and extensive customization through its scripting API. It integrates with system shortcuts for quick access to clipboard history and paste operations.

# CAVEATS

Running multiple instances can cause conflicts. Some Wayland compositors have limited clipboard manager support. Sensitive data like passwords may be stored in history unless excluded by rules. The GUI must be running for the CLI to function.

# HISTORY

CopyQ was created as an open-source clipboard manager, first released around **2009**. It has evolved to include advanced features like scripting, synchronization, and tab organization, becoming one of the most feature-rich clipboard managers available for Linux, Windows, and macOS.

# SEE ALSO

[xclip](/man/xclip)(1), [xsel](/man/xsel)(1), [wl-copy](/man/wl-copy)(1), [pbcopy](/man/pbcopy)(1)
