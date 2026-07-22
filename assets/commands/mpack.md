# TAGLINE

encodes files into MIME format for email transmission

# TLDR

**Encode file as a MIME message** to a file

```mpack -o [output.mime] [file]```

**Encode and mail** the file to one or more recipients

```mpack -s "[Subject]" [file] [user@example.com]```

**Encode to stdout** for piping into another mailer

```mpack -o - [file]```

**Fragment a large file** into multiple messages of at most 100 000 chars each

```mpack -s "[Subject]" -m [100000] [large_file] [user@example.com]```

**Force a specific MIME content type**

```mpack -c application/pdf [report.pdf] [user@example.com]```

**Post the file to a Usenet newsgroup** instead of e-mail

```mpack -n [comp.misc] [file]```

# SYNOPSIS

**mpack** [**-a**] [**-s** _subject_] [**-d** _descriptionfile_] [**-m** _maxsize_] [**-c** _content-type_] _file_ _address_...

**mpack** [**-a**] [**-s** _subject_] [**-d** _descriptionfile_] [**-m** _maxsize_] [**-c** _content-type_] **-o** _outputfile_ _file_

**mpack** [**-a**] [**-s** _subject_] [**-d** _descriptionfile_] [**-m** _maxsize_] [**-c** _content-type_] **-n** _newsgroups_ _file_

# PARAMETERS

**-s** _subject_
> Email subject line.

**-d** _descriptionfile_
> Include the contents of _descriptionfile_ as an introductory text part before the attachment.

**-m** _maxsize_
> Fragment the message into chunks no larger than _maxsize_ characters (0 = no limit).

**-c** _content-type_
> Override the MIME **Content-Type** of the attachment (e.g. **application/pdf**, **image/png**).

**-a**
> Mark the encoded file as an **attachment** (Content-Disposition: attachment) rather than inline.

**-o** _outputfile_
> Write the encoded message to _outputfile_ (use **-** for stdout). When fragmenting, numbered suffixes are appended.

**-n** _newsgroups_
> Post to the named Usenet newsgroup(s) instead of mailing.

# DESCRIPTION

**mpack** encodes a binary or text file into one or more MIME-formatted messages, optionally mailing them to a list of addresses or posting them to a newsgroup. It generates the necessary headers (**MIME-Version**, **Content-Type**, **Content-Transfer-Encoding**, **Content-Disposition**) and base64-encodes binary content. With **-m**, the message is split into independently mailable fragments that **munpack** can reassemble at the other end.

# CAVEATS

Companion to **munpack**. Sending mail or posting requires a configured local MTA (sendmail-compatible) or news transport. Fragmented messages must all reach the recipient and be reassembled with **munpack** before decoding.

# HISTORY

mpack was written by **John G. Myers** at Carnegie Mellon as part of the MIME tools for handling binary email attachments.

# INSTALL

```apt: sudo apt install mpack```

```brew: brew install mpack```

```nix: nix profile install nixpkgs#mpack```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[munpack](/man/munpack)(1), [uuencode](/man/uuencode)(1), [base64](/man/base64)(1), [sendmail](/man/sendmail)(1)
