# TAGLINE

AI maths mentor that marks handwritten work on screen

# TLDR

Run the **self-test** (no model, no screen)

```penmentor --selftest```

Ask about the **current screen** (rofi menu)

```penmentor```

Skip the menu and **check for mistakes** (tablet button)

```penmentor --ask check```

Show the **last marks** again

```penmentor --last```

Ask a model about a **saved screenshot**

```penmentor --test [shot.png] check```

Redraw a saved answer **without the model**

```penmentor --render [shot.png] [shot.penmentor.json]```

# SYNOPSIS

**penmentor** [**--selftest** | **--last** | **--ask** _MODE_ | **--test** _IMAGE_ [_MODE_] | **--render** _IMAGE_ _JSON_]

# PARAMETERS

**(no flags)**
> Screenshot every monitor, open a rofi menu of questions, send the shot (and the current xournal++ page, if the plugin is installed) to the configured agent, and draw the model's marks over the live screen

**--ask** _MODE_
> Skip the menu. _MODE_ is one of `check`, `final`, `nudge`, `technique`, `why`, `drill`, `show`, `box`. Intended for pen-tablet pad buttons

**--last**
> Replay the last overlay from `~/.cache/penmentor/last.json` and `last.png`

**--test** _IMAGE_ [_MODE_]
> Offline: ask the model about _IMAGE_, write `_IMAGE_.penmentor.json` and `_IMAGE_.penmentor.png`. Default _MODE_ is `check`. Sets `QT_QPA_PLATFORM=offscreen`

**--render** _IMAGE_ _JSON_
> Offline: redraw a saved answer onto _IMAGE_ without calling the model. Writes `_IMAGE_.penmentor.png`

**--selftest**
> Run page-analysis, typesetting, plot, and drill tests. No model and no display

# DESCRIPTION

**penmentor** is a Linux X11 CLI that sits over handwritten maths (usually in xournal++ with a pen tablet) and asks Claude, Gemini, or GPT to mark the page the way a teacher would: circles, ticks, underlines, and a faint ghost of the next step. It is built for calculus but reads whatever maths is on screen. The console script is `penmentor` (`penmentor.cli:run`). Python **3.10** or newer is required. The package version is **0.2.0**.

On a normal run it captures every monitor, optionally exports the whole current xournal++ page through a plugin, shows a rofi menu, and sends the images through the command-line agent you already use. Model ids are `harness:model`. A `claude:` prefix runs **claude -p**, `codex:` runs **codex exec**, and `agy:` runs **agy --print**.

The model answers with JSON (a transcription, a verdict, and boxes). penmentor snaps those boxes onto the ink and draws them in a shaped PyQt6 overlay. The marks stay while you keep writing. **Esc** stops penmentor at any point, including while the model is thinking. A second `penmentor` while one is already running sends `SIGUSR1` to the first process: that reopens the overlay menu, or, with **--ask**, asks that question about the work as it is now.

**Show me** (`--ask show`, or the matching menu row) lets you box a region and opens a manimgl window (3Blue1Brown's manim) for Riemann sums, areas, substitutions, solids of revolution, series, Taylor polynomials, and polar or parametric curves.

# CONFIGURATION

**~/.config/penmentor/settings.json**
> Saved settings: `model` (`harness:model`, default `claude:opus`), `effort` (`low`, `medium`, `high`, `xhigh`, `max`; default `medium`), `context` (`on` or `off`; default `on`). Written from the in-app Settings row. `$XDG_CONFIG_HOME` overrides the config directory

**~/.cache/penmentor/**
> Lock file, session JSON (the conversation while context is on), last overlay, freeze log, and `error.log`. `$XDG_CACHE_HOME` overrides the cache directory

**~/.local/share/penmentor/**
> Show-me animation history and the optional manimgl venv at `manim/bin/python`. `$XDG_DATA_HOME` overrides the data directory

Linux on X11 (works best with i3). Bind `penmentor` to a key. Dependencies named by upstream: **rofi**, **slop**, **xdotool**, **libnotify**, PyQt6, NumPy, SciPy, Pillow, matplotlib. Optional TeX packages improve typesetting. The xournal++ plugin is a symlink of `xournalpp-plugin/penmentor` into `~/.config/xournalpp/plugins/penmentor`. Show me needs manimgl in that data-dir venv, or `pip install '.[show]'`.

# CAVEATS

Needs one of `claude`, `codex`, or `agy` installed and logged in. A screenshot of every monitor, plus the current xournal++ page when the plugin is present, is sent to that agent's provider. Nothing else is uploaded, and nothing runs between questions.

X11 only. Wayland is not supported. The overlay is a Qt window that can hold keyboard and mouse; if the event loop stalls for 20 seconds, penmentor dumps a traceback to `~/.cache/penmentor/freeze.log` and exits so X can give them back.

`--ask` with an unknown mode raises an error naming the valid modes. `--selftest` does not talk to a model.

# HISTORY

penmentor is a Python project under the MIT License, version **0.2.0**. It is independent of Anthropic, OpenAI, and xournal++.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [rofi](/man/rofi)(1), [slop](/man/slop)(1), [xdotool](/man/xdotool)(1), [manim](/man/manim)(1), [i3](/man/i3)(1), [notify-send](/man/notify-send)(1), [python](/man/python)(1), [pip](/man/pip)(1), [uv](/man/uv)(1)

# RESOURCES

```[Source code](https://github.com/AbdullahAlhariri/penmentor)```

```[Documentation](https://github.com/AbdullahAlhariri/penmentor/blob/main/docs/guide.md)```

<!-- verified: 2026-10-20 -->
