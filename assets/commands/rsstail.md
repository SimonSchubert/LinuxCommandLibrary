# TAGLINE

Monitor RSS feeds like tail monitors files

# TLDR

**Follow RSS feed**

```rsstail -u [https://example.com/feed.rss]```

**Show with timestamps**

```rsstail -u [url] -p```

**Include descriptions**

```rsstail -u [url] -d```

**Follow multiple feeds**

```rsstail -u [url1] -u [url2]```

**Custom interval**

```rsstail -u [url] -i [300]```

**Show links**

```rsstail -u [url] -l```

# SYNOPSIS

**rsstail** [_-u url_] [_-i seconds_] [_-d_] [_-l_] [_options_]

# PARAMETERS

**-u** _URL_
> Feed URL.

**-i** _SEC_
> Check interval.

**-d**
> Show description.

**-l**
> Show links.

**-p**
> Show timestamps.

**-n** _NUM_
> Initial items.

**-N**
> No initial items.

**-1**
> One check, then exit.

# DESCRIPTION

**rsstail** monitors RSS feeds from the command line, functioning like **tail -f** for web feeds. It periodically checks specified feed URLs and prints new items as they appear, providing a simple way to track updates without a full feed reader.

Multiple feeds can be monitored simultaneously using repeated **-u** flags, and the check interval is configurable with **-i** (in seconds). Output can include titles, descriptions (**-d**), links (**-l**), and timestamps (**-p**), or just titles by default. The **-1** flag performs a single check and exits, useful for scripted feed polling.

# CAVEATS

Network dependent. Feed format matters. May miss items between checks.

# HISTORY

**rsstail** was created to provide a tail-like interface for monitoring RSS feed updates from the command line.

# SEE ALSO

[curl](/man/curl)(1), [tail](/man/tail)(1), [newsboat](/man/newsboat)(1)
