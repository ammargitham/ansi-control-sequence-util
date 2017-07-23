A library of utilities for parsing and interpreting text that contains ANSI control sequences.

This can be used for implementing a terminal emulator or for testing or documenting command-line applications.

## TODO

### Missing emulation

- Handle all cursor movement control sequences:
    - Cursor next line
    - Cursor previous line
    - Cursor horizontal absolute
    - Cursor position
    - Scroll up
    - Scroll down
    - Save cursor position
    - Restore cursor position
- Handle all erase control sequences:
    - Erase part of screen
- Handle text attribute control sequences:
    - Fully handle background color
    - Handle 256 and 24-bit colors
    - Handle underline

### Improvements

- Render unrecognized control sequences in `AnsiConsole` and `HtmlFormatter` in some highly visible way.
- `HtmlFormatter` improvements:
    - Background color should be used for remainder of row when new-line is emitted?
    - Should stream to an `OutputStream`.
    - Escape text content.
- `AnsiConsole` improvements:
    - Erase to end of line should erase character under cursor
    - Support background color: erase should fill with background color?
    - When replacing tail of span with another span, check whether next span has target attributes already
    - When overwriting span contents at offset 0 of span, maybe merge with previous
    - When erasing bold span that is adjacent to non-bold span
- `DiagnosticConsole` improvements:
    - `contents()` should split lines.
- Replace usages of private `ForegroundColor` constructor from tests.
- Collect text attribute and color diagnostics into their respective classes.
- Add a strongly typed visitor that accepts only text tokens
- Add a strongly typed visitor that accepts only text and text attribute tokens
