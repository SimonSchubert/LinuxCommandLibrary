# TAGLINE

Retro terminal music player inspired by Winamp 2.x

# TLDR

**Play all audio files** in a directory recursively

```cliamp ~/Music```

**Play specific files** by format

```cliamp *.mp3 *.flac *.wav *.ogg```

**Play with shuffle** and custom volume

```cliamp --shuffle --volume -5 [path/to/music]```

**Stream audio** from a URL

```cliamp [https://example.com/song.mp3]```

**Play an M3U playlist**

```cliamp [path/to/playlist.m3u]```

**Play a podcast** from an RSS feed

```cliamp [https://example.com/podcast/feed.xml]```

# SYNOPSIS

**cliamp** [_options_] [_files/directories/URLs_]

# PARAMETERS

**--volume** _dB_
> Volume in dB, range -30 to +6. Default 0.

**--shuffle**
> Enable shuffle mode.

**--repeat** _mode_
> Set repeat mode: **off**, **all**, or **one**. Default off.

**--mono** / **--no-mono**
> Enable or disable mono output (L+R downmix).

**--auto-play**
> Start playback immediately.

**--theme** _name_
> Set UI theme by name.

**--eq-preset** _name_
> Set EQ preset: **Flat**, **Rock**, **Pop**, **Jazz**, **Classical**, **Bass Boost**, **Treble Boost**, **Vocal**, **Electronic**, **Acoustic**.

**--bit-depth** _n_
> PCM bit depth: 16 (default) or 32 (lossless).

**--sample-rate** _Hz_
> Output sample rate: 22050, 44100, 48000, 96000, 192000. Default 44100.

**--buffer-ms** _ms_
> Speaker buffer in milliseconds, range 50-500. Default 100.

**--resample-quality** _n_
> Resample quality factor, range 1-4. Default 4.

**--visualizer** _mode_
> Visualizer mode: **Bars**, **Bricks**, **Columns**, **Wave**, **Scatter**, **Flame**, **Retro**, **None**.

**-h**, **--help**
> Show help and exit.

**-v**, **--version**
> Print version and exit.

**--upgrade**
> Update to the latest release.

# DESCRIPTION

**cliamp** is a retro terminal music player inspired by Winamp 2.x. It plays **MP3**, **WAV**, **FLAC**, **OGG**, **AAC**, **ALAC**, **Opus**, and **WMA** with a 10-band spectrum visualizer, 10-band parametric EQ, and playlist management.

It supports local files, directories (recursive scanning), HTTP streaming, M3U/M3U8 playlists, podcast RSS feeds, and URLs from YouTube, SoundCloud, Bandcamp, Bilibili, and Spotify (via yt-dlp). A built-in file browser and playlist manager allow organizing music from within the terminal.

cliamp can also connect to a Navidrome server for remote music streaming via environment variables.

# KEYBOARD CONTROLS

```
Space        Play / Pause
s            Stop
> .          Next track
< ,          Previous track
Left/Right   Seek -/+5s
+ -          Volume up/down
m            Toggle mono
Tab          Toggle focus (Playlist / EQ)
j k          Playlist scroll / EQ band adjust
h l          EQ cursor left/right
Enter        Play selected track
e            Cycle EQ preset
t            Choose theme
v            Cycle visualizer
V            Full-screen visualizer
S            Save track to ~/Music
/            Search playlist
x            Expand/collapse playlist
o            Open file browser
a            Toggle queue (play next)
A            Queue manager
p            Playlist manager
r            Cycle repeat (Off / All / One)
z            Toggle shuffle
Ctrl+K       Show keymap
b Esc        Back to provider
q            Quit
```

# CONFIGURATION

Configuration is stored in **~/.config/cliamp/config.toml**:

```
# Default volume in dB (range: -30 to 6)
volume = 0

# Repeat mode: "off", "all", or "one"
repeat = "off"

# Start with shuffle enabled
shuffle = false

# Start with mono output (L+R downmix)
mono = false

# EQ preset: "Flat", "Rock", "Pop", "Jazz", "Classical",
#             "Bass Boost", "Treble Boost", "Vocal", "Electronic", "Acoustic"
eq_preset = "Flat"

# 10-band EQ gains in dB (range: -12 to 12)
# Bands: 70Hz, 180Hz, 320Hz, 600Hz, 1kHz, 3kHz, 6kHz, 12kHz, 14kHz, 16kHz
eq = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
```

Custom playlists can be created as **.toml** files in **~/.config/cliamp/playlists/**. Running **cliamp** without arguments opens the playlist browser.

# CAVEATS

AAC, ALAC (.m4a), Opus, and WMA playback requires **ffmpeg** installed. MP3, WAV, FLAC, and OGG work without ffmpeg. YouTube/SoundCloud/Bandcamp support requires **yt-dlp**. Non-seekable HTTP streams display a static seek bar with seek keys silently ignored.

# HISTORY

**cliamp** is a terminal music player written in **Go** by developer **bjarneo** (iamdothash), inspired by **Winamp 2.x**. It is built with the **Bubbletea** TUI framework, **Lip Gloss** for styling, and **Beep** for audio playback.

# SEE ALSO

[mpv](/man/mpv)(1), [ffmpeg](/man/ffmpeg)(1), [ffplay](/man/ffplay)(1)
