# TAGLINE

Realtime stock ticker data in your terminal

# TLDR

**Start with specified ticker symbols**

```tickrs -s [AAPL],[MSFT]```

**Candle chart with 1-month timeframe**

```tickrs -s [AAPL] -c candle -t 1M```

**Show pre/post market hours**

```tickrs -s [TSLA] -p```

**Start in summary mode with volume graphs**

```tickrs -s [AAPL],[GOOGL] --summary --show-volumes```

**Show x-axis labels with custom update interval**

```tickrs -s [MSFT] -x -i [5]```

# SYNOPSIS

**tickrs** [_flags_] [_options_]

# PARAMETERS

**-s, --symbols** _SYMBOLS_
> Comma-separated list of ticker symbols to start with.

**-c, --chart-type** _TYPE_
> Chart type: line (default), candle, or kagi.

**-t, --time-frame** _FRAME_
> Time frame: 1D (default), 1W, 1M, 3M, 6M, 1Y, 5Y.

**-i, --update-interval** _SECONDS_
> Interval to update data from API (default: 1).

**-p, --enable-pre-post**
> Enable pre/post market hours for graphs.

**--show-volumes**
> Show volumes graph.

**-x, --show-x-labels**
> Show x-axis labels.

**--summary**
> Start in summary mode.

**--hide-prev-close**
> Hide previous close line on 1D chart.

**--trunc-pre**
> Truncate pre-market graphing to 30 minutes before open.

# DESCRIPTION

**tickrs** displays realtime ticker data sourced from Yahoo! Finance directly in your terminal. It supports multiple chart types, various time frames, pre/post market hours, volume graphs, and portfolio tracking with profit/loss display.

# HISTORY

**tickrs** was created by **tarkah** and is written in **Rust**.

# SEE ALSO

[ticker](/man/ticker)(1), [cointop](/man/cointop)(1)
