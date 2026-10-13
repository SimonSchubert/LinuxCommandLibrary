# TAGLINE

Download songs from a text list as tagged audio using Spotify metadata and YouTube

# TLDR

Download every `Artist - Title` line into **~/Music/trackfetch**

```trackfetch [songs.txt]```

Save into a **specific directory**

```trackfetch [songs.txt] [-o|--output] [path/to/directory]```

Keep YouTube's original audio as **Opus** instead of re-encoding to MP3

```trackfetch [songs.txt] [-f|--format] [opus]```

Keep original **AAC** as M4A

```trackfetch [songs.txt] [-f|--format] [m4a]```

Name files **Title** only, without the artist prefix

```trackfetch [songs.txt] --title-only```

Wait longer between songs to **ease rate limits**

```trackfetch [songs.txt] --delay [3]```

**Retry** songs that failed on a previous run

```cut -d '|' -f 1 [path/to/directory]/failed.txt > [retry.txt] && trackfetch [retry.txt] [-o|--output] [path/to/directory]```

Show **help**

```trackfetch [-h|--help]```

# SYNOPSIS

**trackfetch** [_-h_] [_-o output_] [_-f mp3_|_m4a_|_opus_] [_--title-only_] [_--delay seconds_] _input_

# DESCRIPTION

**trackfetch** reads a plain text file with one `Artist - Title` per line, looks up official metadata and cover art on **Spotify**, picks matching audio on **YouTube** with **yt-dlp**, and writes tagged files. Runs are resumable: finished songs are recorded in `done.txt` in the output directory and skipped next time; failures go to `failed.txt` as `Artist - Title | reason`.

The default output directory is `~/Music/trackfetch`. Tags are written as ID3v2.3 (title, artists, album, album artist, track number, release date, and front cover up to 640×640). Cyrillic and other non-Latin titles are kept in filenames; characters that are illegal in filenames are replaced.

For each song it searches Spotify with `artist:"…" track:"…"` (then a looser query if needed), scores results by fuzzy similarity (70% title, 30% artist), and uses the best match for spelling, credits, album details, and cover. It then searches YouTube for that artist and title and scores the top five results, boosting titles that say official audio and penalizing cover, karaoke, nightcore, sped-up, slowed, remix, and reaction videos. If Spotify has no match, the song is still downloaded and tagged with the artist and title from the input file.

**mp3** (default) re-encodes YouTube audio to VBR MP3. **opus** and **m4a** copy YouTube's original Opus or AAC when available, without a second lossy encode. All three formats get the same tags and cover. `done.txt` does not record the format, so use a separate **--output** directory per format.

The input separator is space, hyphen, space (` - `). Only the first occurrence splits artist from title. Lines starting with `#` are comments; blank lines and lines without the separator are skipped.

Python 3.10 or later is required for the PyPI install. **yt-dlp**, **ffmpeg**, and **deno** must be on `PATH` unless Homebrew or Nix installed them as dependencies. Spotify access uses the Client Credentials flow: a free app on the Spotify Developer Dashboard, with **SPOTIFY_CLIENT_ID** and **SPOTIFY_CLIENT_SECRET** in the environment. trackfetch does not log into a Spotify user account.

# PARAMETERS

_input_
> Text file with one `Artist - Title` per line.

**-o** _dir_, **--output** _dir_
> Directory to write audio, `done.txt`, and `failed.txt`. Created if missing. Default: `~/Music/trackfetch`.

**-f** _fmt_, **--format** _fmt_
> Audio format: **mp3** (default), **m4a**, or **opus**.

**--title-only**
> Name files `Title.ext` instead of `Artist - Title.ext`.

**--delay** _seconds_
> Pause between songs. Default: **1.0**. Raise it for long lists.

**-h**, **--help**
> Show argparse help and exit.

# CONFIGURATION

**SPOTIFY_CLIENT_ID**, **SPOTIFY_CLIENT_SECRET**
> Spotify app Client ID and Client Secret. Required. Create an app at https://developer.spotify.com/dashboard (the form requires a redirect URI; `http://127.0.0.1:8888/callback` is accepted and unused).

Spotipy caches the access token in a `.cache` file in the current working directory. Do not commit or share it.

# CAVEATS

Audio comes from YouTube, not from Spotify's own files. Availability, matching, and quality vary. **mp3** is a second lossy encode. **opus** does not play in iTunes or many older devices. Rate limits and YouTube/Spotify API changes can cause failures; raise **--delay** on long lists. To re-download a song, delete its audio file and its line in `done.txt`. Respect copyright and the terms of the services you query.

# HISTORY

**trackfetch** is GPL-3.0-or-later software by **ByteMe6**. The PyPI package and command are both **trackfetch** (2.1 series at the time of writing). Standalone binaries are published for Linux, macOS, and Windows on x86_64 and ARM64.

# SEE ALSO

[yt-dlp](/man/yt-dlp)(1), [ffmpeg](/man/ffmpeg)(1), [spotdl](/man/spotdl)(1), [ytmdl](/man/ytmdl)(1), [deno](/man/deno)(1)

# RESOURCES

```[Source code](https://github.com/ByteMe6/trackfetch)```

```[Homepage](https://pypi.org/project/trackfetch/)```

```[Documentation](https://github.com/ByteMe6/trackfetch#usage)```

<!-- verified: 2026-10-13 -->
