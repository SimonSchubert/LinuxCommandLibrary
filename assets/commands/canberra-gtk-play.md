# TLDR

**Play a sound event by identifier**

```canberra-gtk-play --id [desktop-login]```

**Play a specific audio file**

```canberra-gtk-play --file [path/to/sound.ogg]```

**Play a sound event with a description**

```canberra-gtk-play --id [bell] --description "[Alert sound]"```

**Play a sound multiple times**

```canberra-gtk-play --file [path/to/sound.ogg] --loop [3]```

**Play with permanent caching for frequently used sounds**

```canberra-gtk-play --id [message] --cache-control permanent```

# SYNOPSIS

**canberra-gtk-play** [**-i** _id_] [**-f** _file_] [**-d** _description_] [**-l** _loops_] [**-c** _cache_] [_options..._]

# DESCRIPTION

**canberra-gtk-play** plays sound events conforming to the XDG Sound Theme and Name Specification. It interfaces with the system sound server (PulseAudio or PipeWire) through **libcanberra** to play contextual sounds for desktop events.

The utility can play predefined event sounds by identifier (e.g., "window-close", "dialog-information", "bell") or specific audio files. It passes metadata to the sound server for context-aware volume control and routing.

# PARAMETERS

**-i, --id=**_identifier_
> Play the sound event with the specified XDG identifier

**-f, --file=**_file_
> Play the specified audio file

**-d, --description=**_description_
> Provide a description for the sound event

**-l, --loop=**_times_
> Number of times to play (default: 1)

**-c, --cache-control=**_mode_
> Cache mode: "permanent" for frequent sounds, "volatile" for temporary caching

**--media-role=**_role_
> Set media role: event, feedback, notification, alarm

**--display=**_display_
> Specify X display to use

# CAVEATS

Requires a running sound server (PulseAudio or PipeWire) with libcanberra support. Sound theme event identifiers depend on installed sound themes and may vary between systems.

# HISTORY

The **libcanberra** project, which includes canberra-gtk-play, was initiated around **2007-2008** to implement the FreeDesktop.org Sound Theme Specification on Linux desktops. It provides an abstract interface for playing event sounds across different sound servers.

# SEE ALSO

[paplay](/man/paplay)(1), [aplay](/man/aplay)(1)
