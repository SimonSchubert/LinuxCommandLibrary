# TAGLINE

Terminal UI for NBA games, scores, and standings

# TLDR

**Launch** the NBA scoreboard TUI

```courtside```

**Install** from source

```git clone https://github.com/NolanFogarty/courtside.git && cd courtside && go build -o courtside```

**Install** with Go

```go install github.com/NolanFogarty/courtside@latest```

# SYNOPSIS

**courtside**

# DESCRIPTION

**courtside** is a keyboard-driven terminal application for following NBA games. It pulls live and historical data from the NBA's public JSON endpoints through the **nba-sdk** library, so no API key or account is required.

On launch, the app opens on today's games. You can move through the schedule, open a game for box score and play-by-play details, jump to any date, filter the list, and view league standings. Games in progress refresh automatically about every 15 seconds.

Navigation is entirely from the keyboard. The interface has three main views: the game list, detailed game view, and standings.

# GAME LIST KEYS

**↑**/**k**, **↓**/**j**
> Move between games

**Enter**
> Open the selected game

**←**/**h**, **→**/**l**
> Previous or next day

**d**
> Jump to a specific date

**s**
> Open league standings

**/**
> Filter games

**q**
> Quit

# GAME DETAIL KEYS

**↑**/**k**, **↓**/**j**
> Scroll play-by-play

**o**
> Toggle expanded stats

**q**, **Esc**
> Return to the game list

# CAVEATS

The NBA endpoints are unofficial and undocumented. They can change or rate-limit without notice.

Because the data source is public but unofficial, availability and field accuracy are not guaranteed for production use.

# SEE ALSO

[go](/man/go)(1)