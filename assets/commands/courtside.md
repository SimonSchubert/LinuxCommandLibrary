# TAGLINE

Terminal UI for NBA games, scores, standings, teams and players

# TLDR

**Launch** the NBA scoreboard TUI

```courtside```

**Install** from source

```git clone https://github.com/NolanFogarty/courtside.git && cd courtside && go build -o courtside && sudo mv courtside /usr/local/bin/```

**Install** with Go

```go install github.com/NolanFogarty/courtside@latest```

# SYNOPSIS

**courtside**

# DESCRIPTION

**courtside** is a keyboard-driven terminal application for following NBA games. It pulls live and historical data from the NBA's public JSON endpoints (**cdn.nba.com** and **stats.nba.com**) through the **nba-sdk** library and direct requests, so no API key or account is required. Injury updates and reported salaries come from ESPN's public JSON feeds, which also serve as a fallback for game details.

On launch, the app opens on today's games. You can move through the schedule, open a game for box score and play-by-play details, jump to any date, filter the list, view league standings and the full-season schedule, and browse all 30 teams with rosters, coaching staff, injuries, salaries and player profiles with career stats and game logs. Games in progress refresh automatically about every 15 seconds.

Navigation is entirely from the keyboard. Many tables are sortable: press **s** to focus the headers, choose a column with the arrow keys, and **[** / **]** scroll wide tables horizontally.

# GAME LIST KEYS

**↑**/**k**, **↓**/**j**
> Move between games

**Tab**
> Switch between the Eastern and Western columns

**PgUp**/**PgDn**
> Turn the page on busy days

**Enter**
> Open the selected game

**←**/**h**, **→**/**l**
> Previous or next day

**d**
> Jump to a specific date

**s**
> Open league standings

**a**
> Open the full-season schedule

**t**
> Open the team browser

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

# TEAM AND PLAYER KEYS

**←**/**→**, **Tab**/**Shift+Tab**
> Switch section

**1**-**5**
> Jump to a section (**1**-**4** on player pages)

**↑**/**k**, **↓**/**j**
> Select a player or scroll

**Enter**
> Open the selected player's details

**o**
> Switch counting/shooting stats on player pages

**s**
> Focus the column headers for sorting

**r**
> Refresh the current team or player

**a**
> Open the selected team's season schedule

**t**
> Return to the team browser

**q**, **Esc**
> Go back

# CAVEATS

The NBA endpoints are unofficial and undocumented. They can change or rate-limit without notice.

Because the data source is public but unofficial, availability and field accuracy are not guaranteed for production use.

# SEE ALSO

[go](/man/go)(1)

# RESOURCES

```[Source code](https://github.com/NolanFogarty/courtside)```

<!-- verified: 2026-11-23 -->
