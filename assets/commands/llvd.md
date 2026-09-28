# TAGLINE

Download LinkedIn Learning courses for offline viewing

# TLDR

Download a **course** by its slug using cookie authentication

```llvd -c [course-slug] --cookies```

Download a course at a specific **resolution**

```llvd -c [course-slug] -r [1080] --cookies```

Download a course with **subtitles** and **exercise files**

```llvd -c [course-slug] --caption --exercise --cookies```

Download a whole **learning path** with a random pause between videos

```llvd -p [path-slug] -t [10,30] --cookies```

Use **corporate account** headers in addition to cookies

```llvd -c [course-slug] --cookies --headers```

Route requests through a list of **proxies**

```llvd -c [course-slug] --cookies --proxy-file [proxies.txt]```

# SYNOPSIS

**llvd** [_options_] **-c** _course-slug_ | **-p** _path-slug_

# PARAMETERS

**-c**, **--course** _SLUG_
> Course slug, the last part of the course URL (e.g. **java-8-essential** from https://www.linkedin.com/learning/java-8-essential).

**-p**, **--path** _SLUG_
> Learning path slug; downloads every course in the path.

**--cookies**
> Authenticate with the **li_at** and **JSESSIONID** cookies read from **cookies.txt** in the current directory.

**--headers**
> Send extra request headers (e.g. **x-li-identity**, **User-Agent**) read from **headers.txt** in the current directory. Needed for some corporate accounts; used together with **--cookies**.

**-r**, **--resolution** _RES_
> Video resolution: **360**, **540**, **720** or **1080**. Default: **720**.

**-ca**, **--caption**
> Download subtitles.

**-e**, **--exercise**
> Download exercise files.

**-t**, **--throttle** _MIN,MAX_
> Wait a random number of seconds between downloads (e.g. **10,30**, or a single value such as **5**) to avoid rate limits.

**--proxy-file** _FILE_
> File with a list of proxies, one per line.

**-v**, **--version**
> Show version and exit.

**--help**
> Display help information.

# DESCRIPTION

**llvd** (LinkedIn Learning Video Downloader) is a Python tool that downloads LinkedIn Learning courses or learning paths into the current directory, grouping videos by chapter. It can resume failed downloads and skips videos that were already downloaded.

Authentication uses cookies copied from a logged-in browser session. Create a **cookies.txt** file in the download directory containing:

```
li_at=xxxxx
JSESSIONID="ajax:xxxxxx"
```

# CAVEATS

Requires an active LinkedIn Learning subscription. Downloading course content may violate LinkedIn's terms of service; use only for personal offline viewing. Cookies expire and must be refreshed periodically. Changes to LinkedIn's site can break the tool until it is updated.

# HISTORY

**llvd** was created by Igwaneza Bruce (knowbee) in **2020** and is distributed on PyPI.

# SEE ALSO

[yt-dlp](/man/yt-dlp)(1), [youtube-dl](/man/youtube-dl)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/knowbee/llvd)```

<!-- verified: 2026-09-29 -->
