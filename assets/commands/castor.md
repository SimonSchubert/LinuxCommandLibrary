# TAGLINE

cast web video streams to a smart TV from the terminal

# TLDR

**Discover** DLNA/UPnP cast targets on the local network

```castor scan```

**Cast interactively** (browse titles in the TUI; needs a TMDB API key)

```castor cast```

Cast a **movie by IMDB/TMDB id** via configured sources

```castor cast movie tt12300742```

Cast a TV **episode** by id

```castor cast episode tt2699128 --season 1 --episode 3```

Cast the video playing on a **web page**

```castor cast player https://example.com/watch/some-video```

Cast a **raw stream URL**

```castor cast url https://example.com/stream.m3u8```

**Dry-run** a cast (print found URLs without sending to the TV)

```castor cast movie --dry-run tt33028778```

Show **version / build** info

```castor info```

# SYNOPSIS

**castor** [*global-options*] *command* [*args*]

# DESCRIPTION

**castor** is a terminal tool that extracts a video stream from a web page (or a direct URL / media id), optionally transcodes it, and casts it in real time to a smart TV or networked media renderer on the same LAN. It launches headless Chrome, watches network traffic over the Chrome DevTools Protocol to locate the stream the page loads, then replays that stream to a DLNA/UPnP device (Chromecast support is experimental).

Unlike screen mirroring, Castor sends the real stream so resolution and quality are preserved. Optional whisper-based subtitles can be burned into the video. Castor ships **no** content catalog and **no** sources of its own; you configure authorized sources in `config.yaml` (or cast a page/URL you already have access to).

Native binaries need **Chrome/Chromium**, **ffmpeg**, and **ffprobe** on `PATH`. Device discovery uses SSDP multicast, so the host must share a network with the TV.

# COMMANDS

**scan**

> Discover DLNA/UPnP (and experimental Chromecast) devices on the local network.

**cast**

> Cast a title or stream. Subcommands / modes include interactive browse (`castor cast`), `movie`, `episode`, `player` (web page URL), and `url` (raw stream).

**info**

> Print version and build information.

# PARAMETERS

**--config** _file_

> Path to configuration file (default: `config.yaml` in the current directory).

**--debug**

> Enable verbose logging (global flag before the subcommand).

**--dry-run**

> With `cast movie` / similar: resolve and print stream URLs without casting.

**--season** _n_, **--episode** _n_

> Season and episode numbers for `cast episode`.

# CONFIGURATION

Castor requires a `config.yaml` in the working directory (or via **--config**). A minimal file names the target device and your own sources:

```
device:
  name: "Living Room TV"
  type: dlna

sources:
  - proxies: ["https://your-source.example"]
    templates:
      movie: "/embed/movie/{itemID}"
      episode: "/embed/tv/{itemID}/{season}-{episode}"
```

Optional `tmdb.api_key` enables the interactive browser. Secrets can go in a sibling `config.local.yaml` that overlays the main file. Environment variables of the form `CASTOR_SECTION__FIELD` also override settings. Auto-generated burned-in subtitles:

```
whisper:
  enable: true
```

# CAVEATS

Device discovery and casting require the host to be on the same LAN as the TV. Docker only works with `--network host` on a real Linux host; Docker Desktop on macOS/Windows cannot reach the LAN for SSDP. Chromecast support is experimental. Castor is a proof of concept for stream extraction and casting engineering—it hosts no content; only cast material you are authorized to access.

# INSTALL

```nix: nix profile install nixpkgs#castor```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [ffprobe](/man/ffprobe)(1), [chromium](/man/chromium)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/stupside/castor)```

```[Documentation](https://github.com/stupside/castor#readme)```

<!-- verified: 2026-07-19 -->
