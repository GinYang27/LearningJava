//To check is two timestamps' difference is 20 days
public Boolean isNew(Timestamp t1, Timestamp t2) {
  return (t1.getTime() - t2.getTime() > 1000 * 60 *60 *24 *20)
}
