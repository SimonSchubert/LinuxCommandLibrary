# TAGLINE

Last.fm scrobbler for the cmus music player

# TLDR

**Initialize** cmusfm and authenticate with Last.fm

```cmusfm init```

**Set cmusfm** as the cmus status display program

```cmus -C "set status_display_program=cmusfm"```

**Restart** the cmusfm background server

```pkill cmusfm```

**Edit the cmusfm** configuration file

```$EDITOR ~/.config/cmus/cmusfm.conf```

# SYNOPSIS

**cmusfm** [**init**]

# DESCRIPTION

**cmusfm** is a standalone Last.fm scrobbler designed for the **cmus** music player. It runs as a background server process that receives track information from cmus via the **status_display_program** interface, then submits "now playing" notifications and scrobbles to Last.fm or compatible services.

Before first use, run **cmusfm init** to authenticate with the Last.fm API. Then configure cmus to use cmusfm by setting **status_display_program=cmusfm** in cmus. The cmusfm server starts automatically when cmus sends its first status update.

# CONFIGURATION

Configuration is stored in **~/.config/cmus/cmusfm.conf**. Edit this file to customize scrobbling behavior.

**format-localfile**
> Regex pattern for parsing local audio file metadata (default: `"^(?A.+) - (?T.+)\.[^.]+$"`)

**format-shoutcast**
> Regex pattern for parsing stream metadata (default: `"^(?A.+) - (?T.+)$"`)

**format-coverfile**
> Regex pattern for cover art file detection (e.g., `"^(cover|folder)\.jpg$"`)

**now-playing-localfile**
> Enable "now playing" notifications for local files (default: yes)

**now-playing-shoutcast**
> Enable "now playing" for streams (default: no)

**submit-localfile**
> Submit scrobbles for local files (default: yes)

**submit-shoutcast**
> Submit scrobbles for streams (default: no)

**notification**
> Display desktop notifications on track change (default: disabled)

**service-api-url**
> Custom scrobbling service API endpoint for Last.fm alternatives (e.g., Libre.fm)

**service-auth-url**
> Custom authentication URL for alternative services

# CAVEATS

The cmusfm server runs as a background process and must be restarted (via **pkill cmusfm**) after configuration changes. The default file name parsing patterns may not match all naming conventions — custom regex patterns can be configured for non-standard file names. Only works with cmus; not compatible with other music players.

# HISTORY

**cmusfm** was created as a lightweight, standalone Last.fm scrobbler specifically for the **cmus** console music player. It is written in **C** and uses the Last.fm API for authentication and scrobbling. The project is maintained on GitHub by **arkq**.

# SEE ALSO

[cmus](/man/cmus)(1), [mpd](/man/mpd)(1), [ncmpcpp](/man/ncmpcpp)(1), [mpc](/man/mpc)(1)
