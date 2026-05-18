# TAGLINE

Chromium-based browser for the terminal

# TLDR

**Open a URL**

```carbonyl [https://example.com]```

**Run inside Docker** without a local install

```docker run --rm -ti fathyb/carbonyl [https://youtube.com]```

**Install globally via npm**

```npm install --global carbonyl```

**Quit** the running browser

```press [q]```

# SYNOPSIS

**carbonyl** [_url_]

# DESCRIPTION

**carbonyl** is a Chromium-based browser that runs entirely in the terminal. It is a fork of Chromium whose rendering pipeline has been rerouted to output Unicode block characters and ANSI color escapes instead of pushing pixels to a window server. This lets it run audio, video, WebGL, WebGPU, JavaScript, and animations at 60 FPS over an SSH session or in a kiosk-mode console where no graphical display is available.

Unlike traditional text browsers (lynx, w3m, elinks), carbonyl renders the full DOM and CSS just as Chromium would, so layouts behave the same as on a desktop browser. Each terminal cell encodes two stacked pixels using U+2584 (lower half block) with foreground and background colors, giving an effective resolution of (columns x 2) by (rows x 2) pixels.

# CAVEATS

Does not yet support browser extensions or downloading files directly. Ad blocking and password management must be handled by external proxies or a side-channel browser. CPU usage scales with FPS and page complexity; pages with constant animations will keep the terminal busy redrawing.

# HISTORY

**carbonyl** was released by **Fathy Boundjadj** in **2022** as an experimental Chromium fork. It generated wide interest as a proof of concept for running modern web applications, including videos and games, in a terminal emulator.

# SEE ALSO

[browsh](/man/browsh)(1), [lynx](/man/lynx)(1), [w3m](/man/w3m)(1), [elinks](/man/elinks)(1)
