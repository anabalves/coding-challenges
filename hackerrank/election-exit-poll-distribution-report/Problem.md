# Election Exit Poll Distribuition Report

Given two tables, `candidates` and `results`, list the number of votes each candidate received in each state. The output should list states in alphabetical order and aggregate candidates with vote counts in descending order, resolving ties by first and last name alphabetically.

---

### Tables

#### candidates
- `id`: int, primary key
- `first_name`: text
- `last_name`: text

#### results
- `candidate_id`: foreign key to `candidates.id`
- `state`: text

---

### Output

- `state`: name of the state
- `votes`: string showing candidates with the number of votes, e.g. `Imojean Peterkin x 3, Cassaundra MacGaughy x 2`

---

### Sample Output

```
Arizona       Imojean Peterkin x 3, Cassaundra MacGaughy x 2
California    Cassaundra MacGaughy x 5, Imojean Peterkin x 1
...
```

---

### Notes

- Vote counts are based on rows in the `results` table.
- Ordering within the `votes` column must be by votes (descending), then by name (alphabetically).
