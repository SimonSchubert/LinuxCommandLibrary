# TAGLINE

Display animated terminal screensavers

# TLDR

**Start a random screensaver**

```gh screensaver```

**Start a specific screensaver**

```gh screensaver -s [fireworks|starfield|pipes|marquee|life|pollock]```

**List** available screensavers

```gh screensaver -l```

Run marquee with a custom **message**

```gh screensaver -s marquee -- --message="[Hello World]"```

Run starfield with custom **density** and **speed**

```gh screensaver -s starfield -- --density [500] --speed [8]```

# SYNOPSIS

**gh** **screensaver** [_options_]

# PARAMETERS

**-s**, **--saver** _name_
> Screensaver to run (fireworks, starfield, pipes, marquee, life, pollock).

**-l**, **--list**
> List available screensavers and exit.

**-R**, **--repo** _repository_
> Run in the context of a repository (currently unused).

# DESCRIPTION

**gh screensaver** is a GitHub CLI extension that displays animated terminal screensavers. Available screensavers are: **fireworks**, **starfield**, **pipes**, **marquee**, **life** (Conway's Game of Life), and **pollock** (paint splotches). Without **-s**, a random screensaver is chosen.

Screensaver-specific options are passed after **--**. For example, marquee supports **--message** and **--font**; starfield supports **--density** and **--speed**; fireworks, pipes, and life support **--color** (full/off); life supports **--seed** (glider, noise, R, dragon, gun, pulsar).

This extension must be installed first with **gh extension install vilmibm/gh-screensaver**. Press **q** or **Ctrl+C** to exit the screensaver.

# CAVEATS

Requires the GitHub CLI (**gh**) and must be installed as an extension. Some animations may not render correctly in terminals with limited color support.

# SEE ALSO

[gh](/man/gh)(1), [gh-extension](/man/gh-extension)(1), [cmatrix](/man/cmatrix)(1)
