# S26-lab05

See the lab handout at: [https://github.com/CMU-17-214/s2026/blob/main/labs/lab05.md](https://github.com/CMU-17-214/s2026/blob/main/labs/lab05.md)

## Task 1 Summary

- Issue: `Frogger` reads `Road`’s internal `occupied` array to check bounds and occupancy, which tightly couples `Frogger` to `Road`’s representation. This is Feature Envy / Inappropriate Intimacy.
- Fix: encapsulate road rules in `Road` by adding `Road.isValidPosition()`, `Road.isOccupied()`, and `Road.canMoveTo()`. `Frogger` now only calls `Road.canMoveTo()` when moving.

## Task 2 Summary

- Issue: `Frogger` and `Records.addRecord(...)` use a long parameter list for identity fields (data clump / long parameter list). `Records` also stores raw `String[]`, which is error-prone and weakly typed.
- Fix: use `FroggerID` as a parameter object. `Frogger` holds a single `FroggerID`, and `Records` stores `List<FroggerID>` and compares via `equals()`.
