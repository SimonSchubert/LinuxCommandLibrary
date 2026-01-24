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

**rsstail** monitors RSS feeds. It works like tail for feeds.

Continuous monitoring. Checks for new items.

Multiple feeds supported. Monitor several sources.

Configurable output. Title, description, links.

Background monitoring. Stay updated.

# CAVEATS

Network dependent. Feed format matters. May miss items between checks.

# HISTORY

**rsstail** was created to provide a tail-like interface for monitoring RSS feed updates from the command line.

# SEE ALSO

[curl](/man/curl)(1), [tail](/man/tail)(1), [newsboat](/man/newsboat)(1)
