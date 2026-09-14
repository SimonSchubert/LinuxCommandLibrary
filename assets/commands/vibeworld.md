# TAGLINE

Persistent cyberpunk multiplayer world in the terminal

# TLDR

**Install** or update the official Linux or macOS binary

```curl -fsSL https://raw.githubusercontent.com/SorBalda/vibeworld/main/install.sh | sh```

**Join** the live multiplayer world

```vibeworld```

**Explore** a full solo world with nothing sent to a server

```vibeworld --offline```

# SYNOPSIS

**vibeworld** [**--offline**]

# PREVIEW

```
  .  *   TERRA
 /--AI--AGORA-\
 | @you  @sam |
 |  HELP  !   |
  \----LUNA---/
   scream >> *
```

# DESCRIPTION

**vibeworld** is a persistent multiplayer world that runs entirely in the terminal. Players walk neon cities organized by scientific field, chat in local streets and in a global **#world** channel, found named corners on the map, fire HELP flares, play arcade games at the Agora, and take a rocket to Luna for the Complaint Crater, Stargazer's Ledge, and a shared pixel mural.

The official client is a single Go binary with no browser or extra packages. On Linux and macOS the upstream install script downloads the matching GitHub release, verifies its SHA256, and installs it as **~/.local/bin/vibeworld** (override the destination with **VIBEWORLD_INSTALL_DIR**). Re-running the same command updates the binary. Windows users download **vibeworld-windows-amd64.exe** from Releases. On first launch the client creates a local account with no email or third-party sign-in.

The live world is served over TLS WebSocket at **wss://vibecity-andrea.fly.dev/ws**. The trial server is capped at 350 concurrent players and sleeps until someone connects, so the first login after idle can be slow while it wakes. **vibeworld --offline** runs a full solo world on the local machine with nothing sent anywhere.

Voice chat is built into the binary (ALSA on Linux, CoreAudio on macOS). Incoming handles, chat, bios, and complaints are stripped of control and escape sequences before they are shown. Traffic is not end-to-end encrypted: the server can read messages that pass through it. Voice is not recorded.

# PARAMETERS

**--offline**
> Run a full solo world locally. No connection is made to the multiplayer server.

# CONTROLS

**arrows** / **hjkl**
> Walk the streets or orbit the planet.

**mouse**
> Click corners, people, buttons, and the map.

**Tab**
> Cycle worlds, regions, cities, and chat tabs.

**Enter**
> Descend, enter a corner or monument, or send chat.

**Esc**
> Back out, all the way to space.

**c**
> Open city chat.

**C**
> Open the corners directory or found a corner.

**m**
> Jump to a monument, or cycle monuments in the Agora.

**!**
> HELP flare in a corner, perform a rite at a monument, or water the moon plant.

**ctrl+V**
> Toggle voice chat (status line reads **ON AIR** while live).

**ctrl+n**
> Lo-fi classical music on the moon.

**]**
> Social column: friends, presence, requests, people, DMs.

**p**
> Edit your profile (bio, optional GitHub or LinkedIn links).

**:**
> Open the command console.

**?**
> In-world help for every key.

# CAVEATS

Official Linux builds cover **x86_64** only; Linux **arm64** is not published yet. macOS builds cover **Apple Silicon**; Intel Mac support is listed as coming later. The install script places the binary in **~/.local/bin**, which must be on **PATH**. There is a single trial multiplayer server with a 350-player cap. Chat, DMs, shared files, and voice go through that server without end-to-end encryption. Client source is not fully public yet (free binaries; planned PolyForm Perimeter); the authoritative server is proprietary.

# HISTORY

**VibeWorld** was created by **Andrea Baldanza**. The public GitHub repository and first release (**v0.1.0**) appeared on **2026-07-03**. The client is written in **Go**. The Mod SDK is **Apache-2.0**; client binaries are free, with client source planned under **PolyForm Perimeter 1.0.0**.

# SEE ALSO

[ascii-royale](/man/ascii-royale)(1), [hunt](/man/hunt)(1), [nethack-console](/man/nethack-console)(1), [weechat](/man/weechat)(1)

# RESOURCES

```[Source code](https://github.com/SorBalda/vibeworld)```

```[Homepage](https://sorbalda.github.io/vibeworld/)```

<!-- verified: 2026-09-14 -->
