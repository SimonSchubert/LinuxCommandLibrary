# TAGLINE

Chromium-based browser for the terminal

# TLDR

**Open URL**

```carbonyl [https://example.com]```

**Run via Docker**

```docker run --rm -ti fathyb/carbonyl [https://youtube.com]```

**Install globally via npm**

```npm install --global carbonyl```

# SYNOPSIS

**carbonyl** [_url_]

# DESCRIPTION

**carbonyl** is a Chromium-based browser that runs entirely in the terminal. It renders web pages using Unicode block characters and ANSI colors, supporting WebGL, WebGPU, audio/video playback, and animations at 60 FPS.

Unlike traditional text browsers, Carbonyl provides near-full web compatibility by forking Chromium and rerouting its rendering pipeline to terminal output.

# FEATURES

**Full web support**
> WebGL, WebGPU, audio, video, animations

**High performance**
> 60 FPS rendering, 0% idle CPU usage

**No window server**
> Works in safe-mode console and SSH sessions

**Fast startup**
> Launches in under one second

# INSTALLATION

**npm**
```
npm install --global carbonyl
```

**Docker**
```
docker run --rm -ti fathyb/carbonyl https://github.com
```

# RENDERING

Uses Unicode character U+2584 (▄) as virtual pixels with ANSI color codes. Each terminal cell represents two vertical pixels.

# CAVEATS

Does not support browser extensions (yet). Cannot download files directly. No built-in ad blocking. Uses 50x less CPU than Browsh for equivalent content.

# SEE ALSO

[browsh](/man/browsh)(1), [lynx](/man/lynx)(1), [w3m](/man/w3m)(1)
