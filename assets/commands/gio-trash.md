# TAGLINE

Move files to trash bin instead of permanently deleting

# TLDR

Move specific files to the **trash bin**

```gio trash [path/to/file_or_directory1] [path/to/file_or_directory2] ...```

**List** trash bin items

```gio trash --list```

**Restore** a specific item from trash using its ID

```gio trash trash://[id]```

# SYNOPSIS

**gio trash** [_options_] [_file_...]

# PARAMETERS

**--list**
> List items in the trash bin

**--empty**
> Empty the trash bin permanently

**-f**, **--force**
> Ignore non-existent files

# DESCRIPTION

**gio trash** moves files to the trash bin instead of permanently deleting them, following the FreeDesktop.org Trash specification. Files are placed in **~/.local/share/Trash/** with metadata to enable restoration.

This is the command-line equivalent of dragging files to the trash in GNOME Files (Nautilus). Trashed files can be viewed in the file manager's Trash location or listed with **gio trash --list**. Files from external drives are trashed to a .Trash-UID directory on that drive.

# CAVEATS

Trash storage is per-filesystem; trashing files from a full filesystem may fail. Very large files consume disk space until the trash is emptied. Some filesystems (like FAT on USB drives) may not support full trash metadata.

# HISTORY

gio trash replaced the older gvfs-trash command when GLib consolidated GVfs utilities into the gio tool in **2016**. The underlying FreeDesktop.org Trash specification dates back to **2004**.

# SEE ALSO

[gio](/man/gio)(1), [rm](/man/rm)(1), [trash-cli](/man/trash-cli)(1)
