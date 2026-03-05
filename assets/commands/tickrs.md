# TAGLINE

Realtime stock ticker data in your terminal

# TLDR

**Start with specified ticker symbols**

```tickrs -t [AAPL],[MSFT]```

**Candle chart with 1-month timeframe**

```tickrs -t [AAPL] --chart-type candle --time-frame 1M```

**Show pre/post market hours**

```tickrs -t [TSLA] --enable-pre-post```

# SYNOPSIS

**tickrs** [_flags_] [_options_]

# PARAMETERS

**-t** _SYMBOLS_
> Comma-separated list of ticker symbols.

**--chart-type** _TYPE_
> Chart type: line, candle, or kagi.

**--time-frame** _FRAME_
> Time frame: 1D, 5D, 1M, 3M, 6M, 1Y, 5Y.

**--enable-pre-post**
> Show pre-market and post-market data.

# DESCRIPTION

**tickrs** displays realtime ticker data sourced from Yahoo! Finance directly in your terminal. It supports multiple chart types, various time frames, pre/post market hours, volume graphs, and portfolio tracking with profit/loss display.

# HISTORY

**tickrs** was created by **tarkah** and is written in **Rust**.

# SEE ALSO

[ticker](/man/ticker)(1), [cointop](/man/cointop)(1), [tstock](/man/tstock)(1)
